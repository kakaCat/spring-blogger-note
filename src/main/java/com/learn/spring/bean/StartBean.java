package com.learn.spring.bean;

import com.learn.springboot.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;

/**
 * @ClassName StartBean
 * @Description Bean
 * @Author yunp
 * @Date 2020/4/16 10:07
 * @Version 1.0
 **/
public class StartBean {


    public static void main(String[] args) {
        new HashMap<>();

        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
    }

}
