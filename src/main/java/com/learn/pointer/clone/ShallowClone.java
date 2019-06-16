package com.learn.pointer.clone;

import com.learn.pointer.Role;

/**
 * Created by JAVA on 2019/6/15.
 */
public class ShallowClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Role role = new Role();
        role.setRoleName("管理");
        Role roleClone = role.clone();
        roleClone.setRoleName("小组");
        System.out.println("源role："+role.getRoleName());
        System.out.println("克隆role："+roleClone.getRoleName());

        System.out.println("源role："+role.hashCode());
        System.out.println("克隆role："+roleClone.hashCode());
    }


}
