package com.nullguo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 郭江彬 on 2018/10/3 0003.
 */
@RestController
public class TestController {
    @RequestMapping("/show")
    public String show(String param){
        return "Spring Cloud Eureka Provider show:"+param;
    }
}
