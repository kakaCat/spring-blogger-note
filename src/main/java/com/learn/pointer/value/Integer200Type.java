package com.learn.pointer.value;

/**
 * @ClassName Integer200Type
 * @Description TODO
 * @Author yunp
 * @Date 2020/1/6 17:13
 * @Version 1.0
 **/
public class Integer200Type {

    public static void main(String[] args) {
        Integer aa  = new Integer(2000);
        System.out.println("integer "+ aa);
        change(aa);

        System.out.println("change integer "+ aa);
    }

    private static void change(Integer aa) {

        aa = 200;
    }
}
