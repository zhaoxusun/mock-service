package com.personal.mock.controller.basic;

import com.personal.mock.dto.MockAppDto;
import com.personal.mock.po.MockApp;
import com.personal.mock.service.MockAppService;
import com.personal.mock.service.validator.ValidationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * author: zhaoxu
 * date: 2019/3/27 上午10:38
 */
@RestController
public class MockGroupController {

    @Autowired
    MockAppService mockAppService;

    @Autowired
    ValidationService validationService;



//    @RequestMapping(path = "mock-app/add",method = RequestMethod.POST)
//    public Object insertMockApp(@RequestBody MockAppDto mockAppDto){
//        List<String> errorMsg = validationService.validate(mockAppDto);
//        if (errorMsg != null && !errorMsg.isEmpty()) {
//            return new Object();
//        }
//        MockApp mockApp = new MockApp();
//        BeanUtils.copyProperties(mockAppDto,mockApp);
//        mockAppService.insertMockApp(mockApp);
//        return null;
//    }

}
