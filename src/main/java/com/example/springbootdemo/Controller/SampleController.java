package com.example.springbootdemo.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @RestController 自动将返回数据封装为json格式  相当于 @Controller+@ResponseBody
 */
@Controller
@RequestMapping(value = "/hello")
public class SampleController {

    /**
     * 作用在方法上@ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中，一般在异步获取数据时使用【也就是AJAX】，
     * 在使用 @RequestMapping后，返回值通常解析为跳转路径，但是加上 @ResponseBody 后返回结果不会被解析为跳转路径，而是直接写入
     * HTTP response body 中。 比如异步获取 json 数据，加上 @ResponseBody 后，会直接返回 json 数据。@RequestBody 将 HTTP
     * 请求正文插入方法中，使用适合的 HttpMessageConverter 将请求体写入某个对象。如果返回到html页面则不需要加@ResponseBody
     */
    @RequestMapping("/html")
    @ResponseBody                                                //若想返回到某个页面，则不加该注解，返回数据则加该注解
    String HelloSpringBoot(){
//      return "/index.html";
        return "HelloSpringBoot";
    }
    /**
     * @RequestMapping(value = "/templates", method = RequestMethod.POST) 相当于PostMapping("/templates");
     * @RequestMapping(value = "/templates", method = RequestMethod.GET)  相当于@GetMapping("/templates");
     */
    @GetMapping("/templates")
    String test(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        map.put("name","郝维格");
        map.put("sex","男");
        map.put("age","23");
        request.setAttribute("key", map);
        return "/index";

    }
}
