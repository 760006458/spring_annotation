package com.heima.service;

import com.heima.dao.UserDao;
import com.heima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * xuan
 * 2018/1/7
 */
@Service
public class UserService {
    @Autowired
    @Qualifier("abc")   // <bean id="abc" class="com.heima.dao.UserDao"/>
    private UserDao userDao;

    public User findUser() {
        return userDao.findUser();
    }
}
