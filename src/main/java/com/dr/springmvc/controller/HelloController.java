package com.dr.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DR
 * @version 1.0
 * @creates in 2023-06-18-15:54
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(){
        // 返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
