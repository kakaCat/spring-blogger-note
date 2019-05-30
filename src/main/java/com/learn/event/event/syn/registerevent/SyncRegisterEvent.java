package com.learn.event.event.syn.registerevent;

import com.learn.event.model.UserDto;
import org.springframework.context.ApplicationEvent;

/**
 * Created by JAVA on 2019/5/3.
 */
public class SyncRegisterEvent extends ApplicationEvent {



    private UserDto userDto;

    public SyncRegisterEvent(Object source,UserDto userDto) {
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
