package com.learn.event.service;


import com.learn.event.event.async.registerevent.AsyncRegisterEvent;
import com.learn.event.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {


    @Autowired
    private ApplicationContext applicationContext;

    /**
     * 用户注册方法
     * @param user
     */
    public void asynRegister(UserDto user)  {

        //../省略其他逻辑

        //发布UserRegisterEvent事件
        applicationContext.publishEvent(new AsyncRegisterEvent(this,user));
    }
//
//    public void randomRegister(UserBean user)  {
//
//        //../省略其他逻辑
//
//        //发布UserRegisterEvent事件
//        applicationContext.publishEvent(new UserRandomRegisterEvent(this,user));
//    }
//
//    public void synRegister(UserBean user)  {
//
//        //../省略其他逻辑
//
//        //发布UserRegisterEvent事件
//        applicationContext.publishEvent(new UserSyncRegisterEvent(this,user));
//    }


}
