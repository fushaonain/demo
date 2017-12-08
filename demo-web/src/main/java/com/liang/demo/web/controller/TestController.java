package com.liang.demo.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xujinliang on 2017/12/7
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    public static final Logger logger = LogManager.getLogger(TestController.class);

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!test");
        return "success";
    }
}
