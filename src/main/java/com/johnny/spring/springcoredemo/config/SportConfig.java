package com.johnny.spring.springcoredemo.config;

import com.johnny.spring.springcoredemo.common.Coach;
import com.johnny.spring.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") // Makes a custom beanId
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
