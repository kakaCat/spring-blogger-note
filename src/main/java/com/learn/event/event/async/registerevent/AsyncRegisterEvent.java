package com.learn.event.event.async.registerevent;

import com.learn.event.model.UserDto;
import org.springframework.context.ApplicationEvent;

/**
 * Created by JAVA on 2019/5/3.
 */
public class AsyncRegisterEvent extends ApplicationEvent {

    //注册用户对象
    private UserDto userDto;

    /**
     * 重写构造函数
     * @param source 发生事件的对象
     * @param userDto 注册用户对象
     */
    public AsyncRegisterEvent(Object source,UserDto userDto) {
        super(source);
        this.userDto = userDto;
    }


    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
