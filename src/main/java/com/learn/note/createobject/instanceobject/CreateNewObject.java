package com.learn.note.createobject.instanceobject;

import com.learn.note.createobject.model.UserModel;

/**
 * Created by JAVA on 2019/5/2.
 */
public class CreateNewObject {


    public static void main(String[] args) {
        UserModel userModel = new UserModel();
        userModel.setName("hello world");

        System.out.println("Object say " + userModel.getName());
    }

}
