package com.heima.publish;

import com.heima.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 用于发布事件
 * xuan
 * 2018/1/8
 */
@Component
public class MyPublish {
    @Autowired  //ApplicationContext在spring容器中默认存在，不需要手动配置@Bean
    private ApplicationContext applicationContext;

    public void myPublish() {
        applicationContext.publishEvent(new MyEvent(this, "处理一封邮件"));
    }
}
