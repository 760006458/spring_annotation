package com.heima.start;

import com.heima.application.MyApplication;
import com.heima.dao.UserDao;
import com.heima.publish.MyPublish;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * xuan
 * 2018/1/7
 */
public class StartMain {
    public static void main(String[] args) throws InstantiationException {
        //1.普通注解开发
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);
//        UserService userService = (UserService) context.getBean("userService");
//        User user = userService.findUser();
//        System.out.println(user);

        //2.验证@ComponentScan(value = "com.heima")可以扫描MyApplication2的@Configuration注解
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);
//        ProductService productService = (ProductService) context.getBean("productService");
//        Product product = productService.findProduct();
//        System.out.println(product);

        //3.profile作用演示：根据开发/生产环境进行不同的配置
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
//        //一定要注意，要先给context设置环境（开发/生产），再注册配置类，否则报错：一旦加载配置类，配置类中的bean就会被实例化，而此时还没有设置bean的实例化方案（开发/生成）
//        context.register(MyApplication.class);
//        context.refresh();
//        UserDao userDao = context.getBean(UserDao.class);

        //4.bean之间通信（Event+Listener）
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);
        MyPublish myPublish = context.getBean(MyPublish.class);
        myPublish.myPublish();
    }
}
