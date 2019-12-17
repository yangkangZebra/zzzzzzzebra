package com.yk.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitmq的配置类， 交换机，队列
 * @author zebra
 * @date 2019年12月17日  
 * @version 1.0
 */
@Configuration
public class RabbitmqConfig {

	public static final String TEST_DIRECT_QUEUE = "testDirectQueue";
	public static final String TEST_DIRECT_EXCHANGE = "testDirectExchange";
	public static final String TEST_ROUTING_KEY = "testRoutingKey";
	
	/**
	 * Description:加载一个名称为testDirectQueue的 队列
	 * @return
	 */
	@Bean
    public Queue testDirectQueue() {
        return new Queue(TEST_DIRECT_QUEUE,true);
    }
	/**
	 * 加载一个直连型交换机（direct exchange）
	 *	直连型交换机（direct）找寻相同routingkey的队列             路由键相同
	 *	扇型交换机（funout）    找寻所有队列  				          路由键没有意义
	 *	主题交换机（topic）       找寻routingkey规则匹配的队列     路由键规则匹配
	 * @return
	 */
	@Bean
	DirectExchange testDirectExchange() {
        return new DirectExchange(TEST_DIRECT_EXCHANGE);
    }
	/**
	 * 完成上面两个bean的绑定,路由键为test_routing_key
	 * @return
	 */
	@Bean
	Binding bindingDirect() {
		return BindingBuilder.bind(testDirectQueue())
					.to(testDirectExchange()).with(TEST_ROUTING_KEY);
	}
}
