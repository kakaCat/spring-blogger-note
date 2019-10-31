package com.learn.ajava.gc.objectgc;

import java.io.IOException;

// 内存足迹 最大Heap -Xmx4m 最小Heap -Xms4m 新生代Heap -Xmn2m

// young /old  1/2
// edem/from/to 8/1/1

// 校验 -XX:+PrintGCDetails
// 标记-复制垃圾收集算法
public class ParallelConllector {

    public static void t() throws IOException {
        System.out.println("running");
        System.in.read();
    }

    // -XX:+PrintFlagsFinal
    // 设置GC 线程数 -XX:ParallelGcThresds=2
    //
    // 设置最大停顿时间-XX:MaxGCPauseMillis=5  统计停顿时间 线程数  看平均时间
    // 吞吐量 时间短gc高
    // 吞吐量 决定垃圾收集与其他应用执行时间的占比
    // -XX:GCTimeRatio= 调整GC时间与非GC时间比 默认99 1/100
    public static void main(String[] args) throws IOException {
        t();
    }



}
