package com.learn.springboot.spi;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Constructor;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SpiName {

    public static void main(String[] args) {
        setInitializers();
//        createInstance();
    }

    private static <T> void createInstance (){
        Class<T> type = (Class<T>) SpringApplicationRunListener.class;
        Class<?>[] parameterTypes = new Class<?>[] { SpringApplication.class, String[].class };
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String name = null;
        try {

            Class<?> instanceClass = ClassUtils.forName(name, classLoader);
            Assert.isAssignable(type, instanceClass);
            Constructor<?> constructor = instanceClass
                    .getDeclaredConstructor(parameterTypes);
            T instance = (T) BeanUtils.instantiateClass(constructor, null);

        }
        catch (Throwable ex) {
            throw new IllegalArgumentException(
                    "Cannot instantiate " + type + " : " + name, ex);
        }
    }


    private static void getSpringFactoriesInstances(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        // Use names and ensure unique to protect against duplicates
        Set<String> names = new LinkedHashSet<>(
                SpringFactoriesLoader.loadFactoryNames(SpringApplicationRunListener.class, classLoader));
//        List<T> instances = createSpringFactoriesInstances(type, parameterTypes,
////                classLoader, args, names);
////        AnnotationAwareOrderComparator.sort(instances);
////        return instances;
    }

    private static void setListeners(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Set<String> names = new LinkedHashSet<>(
                SpringFactoriesLoader.loadFactoryNames(ApplicationListener.class, classLoader));
        String str = JSON.toJSONString(names);
        System.out.println(str);
    }


    private static void setInitializers(){
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Set<String> names = new LinkedHashSet<>(
                SpringFactoriesLoader.loadFactoryNames(ApplicationContextInitializer.class, classLoader));
        String str = JSON.toJSONString(names);
        System.out.println(str);
    }

}
