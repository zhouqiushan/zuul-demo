package com.itheima.zhou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author Admin
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {

    @Bean
    public NameFilter tokenFilter() {
        return new NameFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}

