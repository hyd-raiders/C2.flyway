package com.xdo.flyway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Demo {

    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return  "hello good day";
    }
}
