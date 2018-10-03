package com.nullguo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 郭江彬 on 2018/10/3 0003.
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/show")
    public String show(String params){
        return "CONSUMER:"+restTemplate.getForEntity("http://COMPUTE-SERVICE/show", String.class).getBody();
    }
    }

