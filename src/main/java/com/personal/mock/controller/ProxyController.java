package com.personal.mock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: zhaoxu
 * date: 2019/4/13 下午10:40
 */
@RestController
@RequestMapping(path = "/proxy",method = {RequestMethod.POST,RequestMethod.GET})
public class ProxyController {
    //TODO
}
