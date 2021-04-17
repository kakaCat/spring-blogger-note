package com.learn.pointer.bean;

import com.learn.pointer.Role;
import com.learn.pointer.User;
import org.springframework.beans.BeanUtils;

/**
 * @ClassName BeanUtilsUse
 * @Description TODO
 * @Author yunp
 * @Date 2020/5/25 21:23
 * @Version 1.0
 **/
public class BeanUtilsUse {

    public static void main(String[] args) {
        User u = new User();
        u.setUserName("小红");
        Role role = new Role();
        role.setRoleName("员工");
        u.setRole(role);
        User u2 = new User();
        BeanUtils.copyProperties(u,u2);
        u2.setUserName("小黄");
        System.out.println("u2赋值"+"名字:"+u2.getUserName()+" 角色:"+u2.getRole().getRoleName());
        Role u2r = u2.getRole();
        u2r.setRoleName("主管");
        System.out.println("u结束"+"名字:"+u.getUserName()+" 角色:"+u.getRole().getRoleName());
        System.out.println("u2结束"+"名字:"+u2.getUserName()+" 角色:"+u2.getRole().getRoleName());



        String aa ="";

    }


}
