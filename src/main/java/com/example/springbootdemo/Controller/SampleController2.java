package com.example.springbootdemo.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello11")
@EnableAutoConfiguration
public class SampleController2 {
    @RequestMapping("/html")
    @ResponseBody
    String HelloSpringBoot(){
        return "/index.html";
    }
}
