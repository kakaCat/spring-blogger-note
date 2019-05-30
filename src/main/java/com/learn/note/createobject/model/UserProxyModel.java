package com.learn.note.createobject.model;

/**
 * Created by JAVA on 2019/5/2.
 */
public class UserProxyModel implements  ProxyInterface{


    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
