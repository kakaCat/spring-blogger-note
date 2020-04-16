package com.learn.springboot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;

public class Boot {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Config.class);

        ConfigBean bean = acac.getBean(ConfigBean.class);
        System.out.printf("--configBean --> {}", bean.getName());
        Iterator<String> beanNames = acac.getBeanFactory().getBeanNamesIterator();
        while(beanNames.hasNext()){
            System.out.printf("--BeanFactor--configBean --> {}",beanNames.next());
        }
        acac.close();

    }

}



