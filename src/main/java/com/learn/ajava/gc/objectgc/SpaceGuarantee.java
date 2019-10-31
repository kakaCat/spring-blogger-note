package com.learn.ajava.gc.objectgc;

public class SpaceGuarantee {


    ////-Dfile.encoding=utf-8 -verbose:gc -XX:+PrintGCDetails  -Xmx20m -Xms20m -Xmn10m

    public static void main(String[] args) {
        byte[] d1 =new byte[2*1024*1024];
        byte[] d2 =new byte[2*1024*1024];
        byte[] d3 =new byte[2*1024*1024];
        byte[] d4 =new byte[4*1024*1024];


        System.gc();

    }

}
