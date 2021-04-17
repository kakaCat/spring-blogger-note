package com.learn.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @ClassName MapConverter
 * @Description TODO
 * @Author yunp
 * @Date 2020/12/4 9:10
 * @Version 1.0
 **/
public class MapConverter {

    @Data
    public static class Dome{
        private Long id;

        private String name;
    }


    public static void main(String[] args) {
        Dome dome = new Dome();
        dome.setId(1L);
        dome.setName("王");
        List<Dome> list = new ArrayList<>();
        list.add(dome);


        Map<Long,Dome> map = StructureConverter.toMap(list, Dome::getId);
        Dome dome1 = map.get(1L);
        System.out.println(System.identityHashCode(dome));
        System.out.println(System.identityHashCode(dome1));
        System.out.println(dome.getName());
        System.out.println(dome1.getName());

        dome1.setName("李");
        System.out.println(dome.getName());
        System.out.println(dome1.getName());

    }

}
