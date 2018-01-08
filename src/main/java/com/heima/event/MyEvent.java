package com.heima.event;

import org.springframework.context.ApplicationEvent;

/**
 * xuan
 * 2018/1/8
 */
public class MyEvent extends ApplicationEvent{
    public MyEvent(Object source,String myMessage) {
        super(source);
        System.out.println(myMessage);
        System.out.println("事件执行完毕");
    }
}
