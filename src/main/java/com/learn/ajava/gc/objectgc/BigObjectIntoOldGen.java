package com.learn.ajava.gc.objectgc;

public class BigObjectIntoOldGen {

    //-Dfile.encoding=utf-8 -verbose:gc -XX:+PrintGCDetails  -Xmx20m -Xms20m -Xmn10m -XX:PretenureSizeThreshold=6M

    public static void main(String[] args) {
        byte[] d1 =new byte[6*1024*1024];



        System.gc();


    }

}
