package com.learn.ajava.entity;

public class ClassBlock {

    public static int count(){
        System.out.println("count");
        return 10;
    }

    static {
        count();
        System.out.println("static");
        sum();
    }


    public static int sum(){
        System.out.println("sum");
        return 10;
    }

}
