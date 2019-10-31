package com.learn.ajava.gc.objectgc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CMSCollector {


    // 分代收集器 并发执行 致力于减少停顿时间 不压缩分代空间 STOP-THE-WORLD停顿
    // initial Maik 初始标记（停顿）  ConCurrent Mark(并发标记)  Remark 重标记（停顿）  Concurrent Sweep（并发清扫）
    // 并发失效  （2）空间满了
    // 浮动垃圾 并发
    //
    // 加大内存 ， 修改代码
    //



    // -XX:+UseConcMarkSweepGC -XX:+PrintFlagsFinal -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:MaxGCPauseMillis=100 -XX:ParallelGCThreads=2


    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        Random r = new Random();

        while (true){
            map.put(String.valueOf(r.nextInt()), "true");
        }
    }

}
