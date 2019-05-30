package com.learn.note.createobject.utlis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by JAVA on 2019/5/2.
 */
public class CreateProxyHandler implements InvocationHandler {


    private Object target;


    public CreateProxyHandler(Object target) {
        super();
        this.target = target;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        Object result = method.invoke(target, args);


        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }

}
