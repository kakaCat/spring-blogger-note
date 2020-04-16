package com.learn.springboot.factroy;

import com.learn.springboot.beanexample.TestService;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import static org.springframework.beans.factory.support.BeanDefinitionBuilder.genericBeanDefinition;

public class BeanDefinitionProcess{


    public static void main(String[] args) {

    }


    private static void beanFactory(){
        DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
        bf.registerBeanDefinition("testService", genericBeanDefinition(TestService.class).getBeanDefinition());
    }


    private static AbstractBeanDefinition getBuilder(){
        return genericBeanDefinition(TestService.class).getBeanDefinition();
    }



}
