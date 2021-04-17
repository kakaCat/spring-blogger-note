package com.learn.autowired.Injectautowired;

import java.lang.reflect.Field;

/**
 * Created by JAVA on 2019/5/2.
 */
public class SimpleImpAutowired {

    public static void main(String[] args) {
        AutowiredObject autowiredObject = (AutowiredObject)instantionBean(AutowiredObject.CLASS_PATH);
        Object autowireObject = instantionBean(AutowireObject.CLASS_PATH);

        populateBean(autowiredObject, autowireObject);


        System.out.println("调用注入的对象"+autowiredObject.getAutowireObjectName());

    }

    /**
     *  通过反射获取bean
     */
    public static Object instantionBean(String className){
        Object instance = null;
        try{

            Class<?> clazz = Class.forName(className);
            instance = clazz.newInstance();

            return instance;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


    /**
     * 注入bean
     * */
    public static void populateBean(Object instance,Object autowried){

        Class clazz = instance.getClass();

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (!field.isAnnotationPresent(MyAutowried.class)){ continue; }

            field.setAccessible(true);

            try {

                field.set(instance,autowried);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

    }

}
