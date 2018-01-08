package com.heima.start;

import com.heima.application.MyApplication;
import com.heima.dao.ProductDao;
import com.heima.domain.Product;
import com.heima.domain.User;
import com.heima.service.ProductService;
import com.heima.service.UserService;
import javafx.scene.media.SubtitleTrack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * xuan
 * 2018/1/7
 */
public class StartMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);
//        UserService userService = (UserService) context.getBean("userService");
//        User user = userService.findUser();
//        System.out.println(user);
        ProductService productService = (ProductService) context.getBean("productService");
        Product product = productService.findProduct();
        System.out.println(product);
    }
}
