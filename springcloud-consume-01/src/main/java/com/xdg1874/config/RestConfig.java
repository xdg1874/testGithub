package com.xdg1874.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 定义一个RestTemplate的配置类,用于服务间的相互调用，同HttpClient
 */
@Configuration
public class RestConfig {



    @Bean
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }

}
