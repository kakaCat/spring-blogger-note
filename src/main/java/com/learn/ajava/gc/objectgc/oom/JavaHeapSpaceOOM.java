package com.learn.ajava.gc.objectgc.oom;

public class JavaHeapSpaceOOM {

    //-Xmx1m
    public static void main(String[] args) {

        int size =2*1024*1024;
        //-Xmx10m
        
        int[] ar = new int[size];


    }


}
