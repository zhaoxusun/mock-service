package com.personal.mock.controller;

import com.alibaba.fastjson.JSONObject;
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
 * date: 2019/4/30 下午4:19
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {

    private static Logger logger = LoggerFactory.getLogger(ExceptionController.class);


    @Autowired
    RequestService requestService;

    @Autowired
    HttpServletRequest httpServletRequest;

    @RequestMapping(path = "/matchNothing",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE,
            RequestMethod.HEAD,RequestMethod.OPTIONS,RequestMethod.PATCH,RequestMethod.TRACE})
    public JSONObject requestNotMatch(){
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
        jsonObject.put("exception","your request does not match any data of database, please check!");
        jsonObject.put("request_detail",request);
        return jsonObject;
    }
    @RequestMapping(path = "/matchUnknownStrategy",method = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE,
            RequestMethod.HEAD,RequestMethod.OPTIONS,RequestMethod.PATCH,RequestMethod.TRACE})
    public JSONObject requestMatchUnknownStrategy(){
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
        jsonObject.put("exception","your request match unknown mock-strategy, please check!");
        jsonObject.put("request_detail",request);
        return jsonObject;
    }
}
