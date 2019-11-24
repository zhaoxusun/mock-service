package com.personal.mock.controller.basic;

import com.personal.mock.dto.MockAppDto;
import com.personal.mock.po.MockApp;
import com.personal.mock.result.UniformResult;
import com.personal.mock.service.MockAppService;
import com.personal.mock.service.validator.ValidationService;
import com.personal.mock.vo.MockAppVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * author: zhaoxu
 * date: 2019/3/27 上午10:38
 */
@RestController
@RequestMapping(path = "/mockApp")
public class MockAppController {

    @Autowired
    MockAppService mockAppService;

    @Autowired
    ValidationService validationService;

    @RequestMapping(path = "/add",method = RequestMethod.POST)
    public UniformResult insertMockApp(@RequestBody MockAppDto mockAppDto){
        List<String> errorMsg = validationService.validate(mockAppDto);
        if (errorMsg != null && !errorMsg.isEmpty()) {
            return new UniformResult().failed(10001,errorMsg.get(0));
        }
        MockApp mockApp = new MockApp();
        BeanUtils.copyProperties(mockAppDto,mockApp);
        mockAppService.insertMockApp(mockApp);
        return new UniformResult().success();
    }

    @RequestMapping(path = "/update",method = RequestMethod.POST)
    public UniformResult updateMockApp(@RequestBody MockAppDto mockAppDto){
        List<String> errorMsg = validationService.validate(mockAppDto);
        if (errorMsg != null && !errorMsg.isEmpty()) {
            return new UniformResult<MockAppDto>().failed(10001,errorMsg.get(0));
        }
        MockApp mockApp = new MockApp();
        BeanUtils.copyProperties(mockAppDto,mockApp);
        mockAppService.updateMockApp(mockApp);
        return new UniformResult().success();
    }

    @RequestMapping(path = "/searchById",method = RequestMethod.GET)
    public UniformResult selectMockAppById(@RequestParam(value = "id") Integer id){
        if (id == null){
            return new UniformResult().failed(10001,"param id is required,but not exist");
        }
        MockAppVo mockAppVo = new MockAppVo();
        MockApp mockApp = mockAppService.searchMockAppById(id);
        BeanUtils.copyProperties(mockApp,mockAppVo);
        return new UniformResult().success(mockAppVo);
    }

    @RequestMapping(path = "/search",method = RequestMethod.GET)
    public UniformResult selectMockApp(
            @RequestParam(value = "id",required = false) Integer id,
            @RequestParam(value = "name",required = false) String name,
            @RequestParam(value = "description",required = false) String description,
            @RequestParam(value = "request_type",required = false) String requestType,
            @RequestParam(value = "request_url",required = false) String requestUrl,
            @RequestParam(value = "request_query",required = false) String requestQuery,
            @RequestParam(value = "request_body",required = false) String requestBody,
            @RequestParam(value = "is_active",required = false) Boolean isActive ){
        List<MockApp> result = mockAppService.searchMockApp(id,name,description,requestType,
                requestUrl,requestQuery,requestBody,isActive);
        return new UniformResult().success(result);
    }

}
