package com.learn.ajava.collect;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapLearn {


    public static void main(String[] args) {
        //false 按照插入的顺序 true对get时候的key放入尾部节点
        Map<String,Integer> map =new LinkedHashMap(16,0.75F,true );
        map.put("a", 3);
        map.put("b", 2);
        map.put("c", 1);

        map.get("a");
        Set<String> strs = map.keySet();
        for (String str : strs) {
            System.out.println(str);
        }
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());

        }

//        for (String s : map.keySet()) {
//            System.out.println("key:"+s+",value:"+map.get(s));
//        }
        
        
    }



}
