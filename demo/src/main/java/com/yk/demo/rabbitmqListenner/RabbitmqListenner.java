package com.yk.demo.rabbitmqListenner;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * rabbitmq消息接收监听类
 * 解释：	@RabbitListener 和@RabbitHandler联合使用，不同类型的消息使用不同的方法来处理
 * @author zebra
 * @date 2019年12月17日  
 * @version 1.0
 */
@Component
@RabbitListener(queues = "testDirectQueue")//监听的队列名称 testDirectQueue
public class RabbitmqListenner {
	@RabbitHandler
    public void handler1(@SuppressWarnings("rawtypes") Map msg) {
        System.out.println("DirectReceiver消费者收到消息  : " + msg.toString());
    }
	@RabbitHandler
    public void handler2(String msg) {
        System.out.println("DirectReceiver消费者收到消息  : " + msg);
    }
}
