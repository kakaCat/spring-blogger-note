package com.learn.note.createobject.instanceobject;

import com.learn.note.createobject.model.UserProxyModel;
import com.learn.note.createobject.utlis.CreateProxyHandler;

/**
 * Created by JAVA on 2019/5/2.
 */
public class CreateProxyObject {



    public static void main(String[] args) {

        UserProxyModel userModel = new UserProxyModel();
        userModel.setName("hello world");
        CreateProxyHandler createProxyHandler = new CreateProxyHandler(userModel);

        Object proxy = createProxyHandler.getProxy();

//        System.out.println("ProxyObject say " + proxy.getName());
    }


}
