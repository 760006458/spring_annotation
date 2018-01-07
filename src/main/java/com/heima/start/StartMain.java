package com.heima.start;

import com.heima.application.MyApplication;
import com.heima.domain.User;
import com.heima.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * xuan
 * 2018/1/7
 */
public class StartMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);
        UserService userService = (UserService) context.getBean("userService");
        User user = userService.findUser();
        System.out.println(user);
    }
}
