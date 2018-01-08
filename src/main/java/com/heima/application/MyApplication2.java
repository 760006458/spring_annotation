package com.heima.application;

import com.heima.dao.ProductDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * xuan
 * 2018/1/8
 */
//MyApplication中的@ComponentScan(value = "com.heima")就能扫描到这个配置类，所以main方法不需要加载本类
@Configuration
public class MyApplication2 {
    @Bean
    public ProductDao productDao() {
        return new ProductDao();
    }
}
