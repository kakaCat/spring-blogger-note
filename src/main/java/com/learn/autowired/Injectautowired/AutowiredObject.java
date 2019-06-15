package com.learn.autowired.Injectautowired;

/**
 * Created by JAVA on 2019/5/2.
 */
public class AutowiredObject {

    public static final String CLASS_PATH = "com.learn.autowired.Injectautowired.AutowiredObject";


    @MyAutowried
    private AutowireObject autowireObject;



    public String getAutowireObjectName(){
        return autowireObject.getName();
    }


}
