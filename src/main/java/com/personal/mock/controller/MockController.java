package com.personal.mock.controller;

import com.alibaba.fastjson.JSONObject;
import com.personal.mock.po.MockApp;
import com.personal.mock.service.MockAppService;
import com.personal.mock.service.RequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static com.personal.mock.common.Constant.*;

/**
 * author: zhaoxu
 * date: 2019/4/13 下午10:40
 */
@RestController
@RequestMapping("/mock")
public class MockController {
    private static Logger logger = LoggerFactory.getLogger(MockController.class);

    @Autowired
    MockAppService mockAppService;

    @Autowired
    HttpServletRequest httpServletRequest;

    @Autowired
    RequestService requestService;

    @RequestMapping(path = {"/request"},method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE,
            RequestMethod.HEAD,RequestMethod.OPTIONS,RequestMethod.PATCH,RequestMethod.TRACE})
    public JSONObject mockRequest() {
        Integer mockAppId = Integer.parseInt(httpServletRequest.getHeader(MOCK_APP_ID));
        MockApp mockApp = mockAppService.searchMockAppById(mockAppId);
        logger.info("【请求命中了mock数据，具体如下】");
        logger.info("* 命中策略为：直接返回请求详细数据");
        logger.info("* request uri:"+mockApp.getRequestUri());
        logger.info("* 命中mock_app.id="+mockAppId);
        String requestUri = httpServletRequest.getHeader(REQUEST_URI);
        JSONObject jsonObject = new JSONObject();
        JSONObject request = new JSONObject();
        request.put("request_type",requestService.getMethod());
        request.put("request_uri",requestUri);
        JSONObject header = requestService.getRequestHeader();
        header.remove(MOCK_APP_ID);
        header.remove(MOCK_STRATEGY_ID);
        header.remove(REQUEST_URI);
        request.put("request_header",header);
        request.put("request_query",requestService.getQueryString());
        request.put("request_body",requestService.getRequestBody());
        jsonObject.put("mock_strategy","direct_return_request");
        jsonObject.put("request_detail",request);
        return jsonObject;
    }

    @RequestMapping(path = {"/response"},method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE,
            RequestMethod.HEAD,RequestMethod.OPTIONS,RequestMethod.PATCH,RequestMethod.TRACE})
    public JSONObject mockResponse() {
        System.out.println(requestService.getRequestHeader());
        Integer mockAppId = Integer.parseInt(httpServletRequest.getHeader(MOCK_APP_ID));
        MockApp mockApp = mockAppService.searchMockAppById(mockAppId);
        logger.info("【请求命中了mock数据，具体如下】");
        logger.info("* request uri:"+mockApp.getRequestUri());
        logger.info("* 命中策略为：直接返回预期返回值");
        logger.info("* 命中mock_app.id:"+mockAppId);
        return JSONObject.parseObject(mockApp.getMockData());

    }

}
