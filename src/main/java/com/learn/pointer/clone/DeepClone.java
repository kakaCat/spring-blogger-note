package com.learn.pointer.clone;

import com.learn.pointer.Role;
import com.learn.pointer.User;

import java.math.BigDecimal;

/**
 * Created by JAVA on 2019/6/15.
 */
public class DeepClone {



    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        Role role = new Role();
        role.setRoleName("管理");
        user.setUserName("小王");
        BigDecimal money = new BigDecimal("100");
        user.setMoney(money);
        user.setRole(role);

        User userClone = user.clone();
        Role roleClone = userClone.getRole();
        roleClone.setRoleName("小组");
        userClone.setUserName("小明");
        userClone.setRole(roleClone);

        System.out.println("源 user"+user.toString());
        System.out.println("克隆 user"+userClone.toString());

        System.out.println("源 user "+user.hashCode());
        System.out.println("克隆 user "+userClone.hashCode());

        System.out.println("源 user.role "+user.getRole().hashCode());
        System.out.println("克隆 user.role "+userClone.getRole().hashCode());


        System.out.println("源 user.money "+user.getMoney().hashCode());
        System.out.println("克隆 user.money "+userClone.getMoney().hashCode());

    }
}
