package com.personal.mock.controller.basic;

import com.personal.mock.dto.MockAppDto;
import com.personal.mock.dto.MockAppStrategyDto;
import com.personal.mock.po.MockApp;
import com.personal.mock.po.MockAppStrategy;
import com.personal.mock.service.MockAppService;
import com.personal.mock.service.MockAppStrategyService;
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
public class MockAppStrategyController {

    @Autowired
    MockAppStrategyService mockAppStrategyService;

    @Autowired
    ValidationService validationService;



    @RequestMapping(path = "mock-app-strategy/add",method = RequestMethod.POST)
    public Object insertMockApp(@RequestBody MockAppStrategyDto mockAppStrategyDto){
        List<String> errorMsg = validationService.validate(mockAppStrategyDto);
        if (errorMsg != null && !errorMsg.isEmpty()) {
            return new Object();
        }
        MockAppStrategy mockAppStrategy = new MockAppStrategy();
        BeanUtils.copyProperties(mockAppStrategyDto,mockAppStrategy);
        mockAppStrategyService.insertMockApp(mockAppStrategy);
        return null;
    }

}
