package com.learn.note.createobject.instanceobject;

import com.learn.note.createobject.model.UserModel;

/**
 * Created by JAVA on 2019/5/2.
 */
public class CreateCloneObject {

    public static void main(String[] args) throws CloneNotSupportedException {
        UserModel userModel = new UserModel();
        userModel.setName("hello world");

        System.out.println("Object say " + userModel.getName());

        UserModel cloneModel =  userModel.clone();

        System.out.println("CloneObject say " + cloneModel.getName());

        cloneModel.setName("diffent world");

        System.out.println("Object say " + userModel.getName());

        System.out.println("CloneObject say " + cloneModel.getName());

    }

}
