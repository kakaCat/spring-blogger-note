package com.learn.pointer.bean;

import com.learn.pointer.Role;
import org.springframework.beans.BeanUtils;

/**
 * @ClassName Bean1
 * @Description TODO
 * @Author yunp
 * @Date 2020/5/25 21:17
 * @Version 1.0
 **/
public class BeanUtilsRole {

    public static void main(String[] args) {
        Role role = new Role();
        role.setRoleName("员工");
        System.out.println("role初始"+role.getRoleName());
        Role role2 = new Role();
        System.out.println("role2初始"+role2.getRoleName());
        BeanUtils.copyProperties(role,role2);
        System.out.println("role2赋值"+role2.getRoleName());
        role.setRoleName("主管");
        System.out.println("role赋值"+role.getRoleName());
        System.out.println("role2结束"+role2.getRoleName());
    }


}
