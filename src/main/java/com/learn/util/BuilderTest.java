package com.learn.util;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class BuilderTest {


    private String name;

    private List<String>  list;


    private Map<String,String> map;






    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");

//        BuilderTest test = Builder.of(new ArrayList<>())

//                .with(BuilderTest::setName,"aaa")
//                .with(BuilderTest::setList,list)
//                .build();
//
//        System.out.println(test.toString());
    }

}
