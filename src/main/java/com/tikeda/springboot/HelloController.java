package com.tikeda.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController 
{
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello HPE v2, Spring Boot Sample Application in OpenShift Demo";
    }
    
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello HPE v2, Spring Boot Sample Application(in /test) in OpenShift Demo";
    }
}
