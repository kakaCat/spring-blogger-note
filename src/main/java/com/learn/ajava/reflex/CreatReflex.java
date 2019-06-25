package com.learn.ajava.reflex;

import com.learn.ajava.entity.ReflexEntity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreatReflex {

    public static void main(String[] args) {

        reflex3();

    }

    public static Class<?> reflex1(){
        ReflexEntity reflexEntity = new ReflexEntity();
        Class c = reflexEntity.getClass();
        System.out.println(c.getName());
        return c;
    }


    public static Class<?> reflex2(){
        Class<ReflexEntity> c = ReflexEntity.class;
        System.out.println(c.getName());
        return c;
    }

    public static Class<?> reflex3(){
        Class<?> c = null;
        try {
            c = Class.forName("com.learn.ajava.entity.ReflexEntity");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static Object newInstance(Class<?> c){
        try {
            return c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Object constructor(Class<?> c){
        Constructor<?> constructor = null;
        Object obj ;
        try {
            constructor = c.getConstructor();
            obj = constructor.newInstance();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
