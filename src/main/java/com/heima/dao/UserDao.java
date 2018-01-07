package com.heima.dao;

import com.heima.domain.User;

/**
 * xuan
 * 2018/1/7
 */
public class UserDao {
    public User findUser(){
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        return user;
    }
}
