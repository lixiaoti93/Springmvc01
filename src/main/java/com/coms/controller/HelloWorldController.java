package com.coms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/hello.do")
    public String hellSpringMVC(){
        return "hellospringmvc";
    }
}
