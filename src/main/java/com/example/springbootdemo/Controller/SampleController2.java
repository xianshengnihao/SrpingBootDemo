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
    /**
     * 作用在方法上@ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中，一般在异步获取数据时使用【也就是AJAX】，
     * 在使用 @RequestMapping后，返回值通常解析为跳转路径，但是加上 @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入
     * HTTP response body 中。 比如异步获取 json 数据，加上 @ResponseBody 后，会直接返回 json 数据。@RequestBody 将 HTTP
     * 请求正文插入方法中，使用适合的 HttpMessageConverter 将请求体写入某个对象。如果返回到html页面则不需要加@ResponseBody
     */
    @ResponseBody
    String HelloSpringBoot(){
//      return "/index.html";
        return "HelloSpringBoot";
    }
}
