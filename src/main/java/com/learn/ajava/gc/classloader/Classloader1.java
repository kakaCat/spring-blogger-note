package com.learn.ajava.gc.classloader;

public class Classloader1 {

    public static void main(String[] args) {
        System.out.println(new Classloader1().getClass().getClassLoader().getParent().getParent());
        System.out.println(new Classloader1().getClass().getClassLoader().getParent());
        System.out.println(new Classloader1().getClass().getClassLoader());
        System.out.println("=========================");
        System.out.println(new Object().getClass().getClassLoader());




    }


}
