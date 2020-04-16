package com.learn.springboot.beanexample;

import com.learn.springboot.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class TestService {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();


    }

}
