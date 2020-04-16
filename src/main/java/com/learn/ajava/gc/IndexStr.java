package com.learn.ajava.gc;

public class IndexStr {


    public static void main(String[] args) {

        String str = "ABC";
        String strnew = new String("ABC");

        Integer i = 300;
        changeInt(i);
        change(str);
        changenew(strnew);

        System.out.println("str->"+str);
        System.out.println("strnew->"+strnew);

        System.out.println("i->"+i);
    }

    private static void changenew(String strnew) {
        strnew = strnew.toLowerCase();
    }

    private static void changeInt(Integer i) {

        i =100;
    }

    private static void change(String str) {
        str = str.toLowerCase();

    }

    
    
}
