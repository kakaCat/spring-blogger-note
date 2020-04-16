package com.learn.note.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * Created by JAVA on 2019/6/16.
 */
public class ChangeFiled {

    public static void main(String[] args) {
        field();
        method();
    }


    private static void field(){

        BigDecimal value = new BigDecimal(1000);
        Field declaredField = null;
        try {
            declaredField = BigDecimal.class.getDeclaredField("intCompact");
            declaredField.setAccessible(true);
            declaredField.set(value,10L);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        new Integer(100);
        System.out.println("field value :" +value.toString());

    }


    private static void method(){
        BigDecimal value = new BigDecimal(1000);
        Method setReadOnly = null;
        try {
            setReadOnly = value.getClass().getMethod("intCompact", long.class);
            setReadOnly.invoke(value,10L);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("method value :" +value.toString());

    }


}
