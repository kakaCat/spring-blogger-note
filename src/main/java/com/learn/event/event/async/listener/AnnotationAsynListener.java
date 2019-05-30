package com.learn.event.event.async.listener;

import com.learn.event.event.async.registerevent.AsyncRegisterEvent;
import com.learn.event.model.UserDto;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by JAVA on 2019/5/3.
 */
@Component
public class AnnotationAsynListener {

    @EventListener
    public void register(AsyncRegisterEvent asyncRegisterEvent) {

        //获取注册用户对象
        UserDto userDto = asyncRegisterEvent.getUserDto();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("异步注册信息，用户名："+userDto.getName());
    }

}
