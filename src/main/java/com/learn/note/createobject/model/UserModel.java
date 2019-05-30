package com.learn.note.createobject.model;

import java.io.Serializable;

/**
 * Created by JAVA on 2019/5/2.
 */

/**
 * Cloneable 为了实现clone
 * Serializable 为了实现序列化
 */

public class UserModel implements Serializable ,Cloneable {

    private static final long serialVersionUID = -5809782578272943999L;


    public UserModel(String name){
        this.name = name;
    }

    public UserModel(){

    }

    public static final String MY_PATH = "com.learn.note.createobject.model.UserModel";

    private String name;



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public UserModel clone() throws CloneNotSupportedException {
        UserModel o = (UserModel)super.clone();

        return o;
    }
}
