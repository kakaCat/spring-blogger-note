package com.learn.note.createobject.instanceobject;

import com.learn.note.createobject.model.UserModel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by JAVA on 2019/5/2.
 */
public class CreateInjectObject2 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class clazz = Class.forName(UserModel.MY_PATH);
        Constructor constructor = clazz.getConstructor();
        UserModel instance = (UserModel)constructor.newInstance();

        instance.setName("hello world");

        System.out.println("Object say " + instance.getName());

    }

}
