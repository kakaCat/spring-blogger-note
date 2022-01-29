package com.learn.ajava.collect;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CCHMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new ConcurrentHashMap<>();

        map.put("1",1);

        map.get("1");
    }
}
