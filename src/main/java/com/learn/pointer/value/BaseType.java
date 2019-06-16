package com.learn.pointer.value;

import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * Created by JAVA on 2019/6/16.
 */
public class BaseType {

    public static void main(String[] args) {

        int a = 1;
        change(a);
        System.out.println("a :" +a);

        BigDecimal b = new BigDecimal(100);

        change(b);
        System.out.println(" b :" +b.toString());

        filechange(b);
        System.out.println("filechange b :" +b.toString());
    }


    private static void change(int a){
        a = 2;

        System.out.println("exchange a :" +a);

    }

    private static void change(BigDecimal b){

        b = new BigDecimal(200);

        System.out.println("exchange a :" +b.toString());

    }

    private static void filechange(BigDecimal b)  {
        Field declaredField = null;
        try {
            declaredField = BigDecimal.class.getDeclaredField("intCompact");
            declaredField.setAccessible(true);
            declaredField.set(b,10L);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        new Integer(100);
        System.out.println("filechange b :" +b.toString());

    }
}
