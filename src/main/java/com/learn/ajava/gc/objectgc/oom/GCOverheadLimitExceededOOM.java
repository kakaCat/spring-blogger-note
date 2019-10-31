package com.learn.ajava.gc.objectgc.oom;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GCOverheadLimitExceededOOM {

    //-Xmx128m
    //-Xmx32m -XX:+PrintFlagsFinal
    //-XX:+PrintGCDetails
    //-XX:+PrintGCTimsStamps
    //-XX:+PrintFlagsFinal -XX:+PrintGCDetails -XX:+PrintGCTimeStamps
    public static void main(String[] args) {

        Map<String,String> map =new HashMap<>();
        Random r = new Random();

        while (true){
            map.put(String.valueOf(r.nextInt()), "true");
        }


    }
    // Map  HashMap
    //      TreeMap
    //      IdentifyHashMap

// 0.286(回收时间): [GC (Allocation Failure) [PSYoungGen: 8704K->992K(9728K)] 8704K->6517K(31744K), 0.0130933 secs] [Times: user=0.05 sys=0.02, real=0.01 secs]

//0.355: [Full GC (Ergonomics) [PSYoungGen: 1024K->0K(9728K)] [ParOldGen: 13713K->14554K(22016K)] 14737K->14554K(31744K), [Metaspace: 3263K->3263K(1056768K)], 0.1607006 secs] [Times: user=0.31 sys=0.00, real=0.16 secs]


}
