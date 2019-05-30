package com.learn.note.createobject.instanceobject;

import com.learn.note.createobject.model.UserModel;

import java.io.*;

/**
 * Created by JAVA on 2019/5/2.
 */
public class CreateSerializableObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        UserModel userModel = new UserModel();
        userModel.setName("hello world");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        out.writeObject(userModel);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        UserModel serializable = (UserModel) in.readObject();
        in.close();

        System.out.println("Object say " + serializable.getName());
    }

}
