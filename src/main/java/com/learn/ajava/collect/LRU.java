package com.learn.ajava.collect;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K,V> extends LinkedHashMap<K, V> implements Map<K, V> {

    private static final long serialVersionUID = 1L;

    private int cacheSize;


    public LRU(int initialCapacity,
               float loadFactor,
               boolean accessOrder,int limit) {
        super(initialCapacity, loadFactor, accessOrder);
        if(limit<=0){
            throw new IllegalArgumentException("Illegal load limit: " +
                    limit);
        }
        this.cacheSize=cacheSize;
    }

    /**
     * @description 重写LinkedHashMap中的removeEldestEntry方法，当LRU中元素多余6个时，
     *              删除最不经常使用的元素
     * @author rico
     * @created 2017年5月12日 上午11:32:51
     * @param eldest
     * @return
     * @see java.util.LinkedHashMap#removeEldestEntry(java.util.Map.Entry)
     */
    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size() > cacheSize ? true : false;
    }

    public static void main(String[] args) {

        LRU<Character, Integer> lru = new LRU<Character, Integer>(
                16, 0.75f, true,6);

        String s = "abcdefghijkl";
        for (int i = 0; i < s.length(); i++) {
            lru.put(s.charAt(i), i);
            lru.put('a',0);
        }
        System.out.println("LRU中key为h的Entry的值为： " + lru.get('h'));
        System.out.println("LRU的大小 ：" + lru.size());
        System.out.println("LRU ：" + lru);
    }
}
