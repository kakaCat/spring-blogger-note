package com.learn.note.pointer.objectclass;

/**
 * Created by JAVA on 2019/6/8.
 */
public class ObjectPointer {

    public static void main(String[] args) {




        Model a = new Model();
        a.setName("A");
        changeName(a);
        System.out.println("a Model name:"+a.getName());
        Model b = a;
        System.out.println("b Model name:"+b.getName());
        changeBName(b);
        System.out.println("a Model name:"+a.getName());
        System.out.println("b Model name:"+b.getName());
    }

    private static void changeBName(Model b) {
        b.setName("C");
        System.out.println("Changed b Model name:"+b.getName());
    }

    private static void changeName(Model a) {
        a.setName("B");
        System.out.println("Changed a Model name:"+a.getName());
    }


}
