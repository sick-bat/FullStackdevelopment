package com.example.spring.config;

import org.springframework.context.annotation.Bean;

import com.example.spring.util.FileChecker;
import com.example.spring.util.FileUtil;

public class AppConfig {
   
    @Bean // lifecyle of this FileUtil would be handled by spring IoC container
    public FileUtil util() {
        return new FileUtil();
    }

    @Bean // lifecyle of this FileChecker along with dependency FileUtil, would be handled by Spring IoC container
    public FileChecker checker(FileUtil util) {
        return new FileChecker(util);
    }

    @Bean
    public FileUtil utilData() {
        return new FileUtil();
    }
}