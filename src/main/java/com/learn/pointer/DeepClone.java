package com.learn.pointer;

/**
 * Created by JAVA on 2019/6/15.
 */
public class DeepClone {



    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        Role role = new Role();
        role.setRoleName("管理");
        user.setUserName("小王");
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
    }
}
