package com.heima.listener;

import com.heima.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听MyEvent中构造方法的执行
 * xuan
 * 2018/1/8
 */
@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("监听到：MyEvent事件执行完毕");
    }
}
