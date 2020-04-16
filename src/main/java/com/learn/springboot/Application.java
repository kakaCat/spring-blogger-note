package com.learn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@EnableApolloConfig
public class Application {


    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
    }

}
