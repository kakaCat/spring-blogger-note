package com.learn.note.createobject.instanceobject;

import com.learn.note.createobject.model.UserModel;

/**
 * Created by JAVA on 2019/5/2.
 */
public class CreateInjectObject1 {


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class clazz = Class.forName(UserModel.MY_PATH);
        UserModel instance = (UserModel)clazz.newInstance();

        instance.setName("hello world");

        System.out.println("Object say " + instance.getName());
    }

}
