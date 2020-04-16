package com.learn.pointer.value;

import com.learn.pointer.Role;

/**
 * Created by JAVA on 2019/6/16.
 */
public class ObjecctType {

    public static void main(String[] args) {
        Role role = new Role();
        role.setRoleName("管理");

        change(role);

    }

    public static void change(Role role) {
        role.setRoleName("小组");
    }


}
