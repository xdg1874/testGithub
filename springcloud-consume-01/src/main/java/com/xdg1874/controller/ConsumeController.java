package com.xdg1874.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 小达哥
 * 2021/12/7
 */
@RestController
public class ConsumeController {

    @Resource
    RestTemplate restTemplate;    //内部调用服务可以直接使用RestTemplate模板对象，外部调用使用Fegin

    @GetMapping("/springCloud/test1")
    public String test1(){
        String body = restTemplate.getForEntity("", String.class).getBody();

        return body;
    }
}
