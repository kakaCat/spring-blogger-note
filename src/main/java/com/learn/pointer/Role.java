package com.learn.pointer;

/**
 * Created by JAVA on 2019/6/15.
 */
public class Role implements Cloneable{

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public Role clone() throws CloneNotSupportedException {
        Role role = (Role)super.clone();
        return role;
    }

}
