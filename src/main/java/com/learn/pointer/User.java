package com.learn.pointer;

import java.math.BigDecimal;

/**
 * Created by JAVA on 2019/6/15.
 */
public class User implements Cloneable{

    private String userName;

    private Role role;

    private BigDecimal money;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString(){
        return "user:" + this.userName + "  role:" + role.getRoleName() + " monty:" + this.money;
    }


    @Override
    public User clone() throws CloneNotSupportedException {
        User user = (User)super.clone();
        role = this.role.clone();
        return user;
    }

}
