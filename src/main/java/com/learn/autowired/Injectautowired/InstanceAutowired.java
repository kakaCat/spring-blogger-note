//package com.learn.autowired.Injectautowired;
//
//import java.lang.reflect.Field;
//import java.util.Map;
//import java.util.Set;
//import java.util.concurrent.ConcurrentHashMap;
//
///**
// * Created by JAVA on 2019/5/2.
// */
//public class InstanceAutowired {
//
//    private Map<String,Object> context = new ConcurrentHashMap();
//
//
//
//    public <T> T getBean(){
//
//        Set<String> keys = context.keySet();
//        for (String key : keys) {
//            Object instance = context.get(key);
//
//        }
//
//        return  populateBean();
//
//    }
//
//
//
//
//
//
//    public static void populateBean(Object instance,String beanName){
//
//        Class clazz = instance.getClass();
//
//        Field[] fields = clazz.getDeclaredFields();
//
//        for (Field field : fields) {
//            if (!field.isAnnotationPresent(MyAutowried.class)){ continue; }
//
//            field.setAccessible(true);
//
//            try {
//                Object autowired = context.get(beanName);
//                field.set(instance,autowired);
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//    }
//
//
//}
