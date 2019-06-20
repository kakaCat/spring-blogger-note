package com.learn.ajava.staticinfo;

import com.learn.ajava.entity.Outer;

public class StaticClass {


    public static void main(String[] args) {

        Outer.Builder all = new Outer.Builder().age(11).name("11");
        System.out.println("age :" + all.hashCode());
        System.out.println("age :" + all.toString());



        Outer.Builder age = new Outer.Builder().age(11);
        System.out.println("age :" + age.hashCode());
        System.out.println("age :" + age.toString());


    }


}
