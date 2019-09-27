package com.qf.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
* 添加一个标签
* */
@Controller
@RequestMapping("stu")
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        System.out.println("有点吊的过滤器");
        System.out.println("确实是有点吊的过滤器");
        return "一点一滴";
    }
}
