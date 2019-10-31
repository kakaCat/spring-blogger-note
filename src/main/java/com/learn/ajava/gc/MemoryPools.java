package com.learn.ajava.gc;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.util.Arrays;

public class MemoryPools {

    private String data;

    public MemoryPools(){
        this.data="running";
    }

    public static void main(String[] args) throws IOException {

        ManagementFactory.getMemoryManagerMXBeans()
                .forEach(mxdata->{
            System.out.printf("当前 MemoryManagerMXBean 名称：%s 以及它关联内存池名称： %s\n" ,
                    mxdata.getName(), Arrays.asList(mxdata.getMemoryPoolNames()));
        });

        System.in.read();
    }


}
