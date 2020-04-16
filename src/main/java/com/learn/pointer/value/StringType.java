package com.learn.pointer.value;

/**
 * @ClassName StringType
 * @Description TODO
 * @Author yunp
 * @Date 2020/1/6 16:59
 * @Version 1.0
 **/
public class StringType {

    public static void main(String[] args) {

        String aa = "0001";


        change(aa);

    }

    public static void change(String aa) {

        aa = "0002";

    }


}
