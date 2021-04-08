package com.lisong.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lisong
 * @create 2021-04-08 21:27
 */
@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
