package com.laoliu13.openfeign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
    	return Logger.Level.BASIC;
    }
}
