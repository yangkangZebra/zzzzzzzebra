package com.yk.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yk.demo.config.RabbitmqConfig;
import com.yk.demo.pojo.Shop;
import com.yk.demo.service.DemoSerive;
import com.yk.demo.utils.RedisUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController("demo")
@Api("demo接口API")
public class DemoController {

	@Autowired
	DemoSerive demoSerive;
	
	@Autowired
	RedisUtils redisUtils;
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	private static final int TEN = 10;
	/**
	 * 整合mybtis测试
	 * @param id
	 * @return
	 */
	@GetMapping("getInfoById/{id}")
	@ApiOperation(value="根据id获取信息",notes="传入id")
	public Shop getHelloWorld(
			@ApiParam(name = "id", value = "测试id", required = true)
			@PathVariable("id") int id) {
		return demoSerive.selectById(id);
	}
	/**
	 * 整合redis测试
	 * @param id
	 * @return
	 */
	@PostMapping("/setKey")
	@ApiOperation(value="测试redis")
	public String testRedis(@ApiParam(name = "key", value = "传入需要保存的值", required = true)
	@RequestParam("key") String key) {
		String now = System.currentTimeMillis()+"";
		//插入
		redisUtils.set(key, now , TEN);
		//获取结果,设置10s失效
		String result = redisUtils.get(key).toString();
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//此时获取结果为null
		return result;
	}
	@PostMapping("/testRabbitMq")
	public boolean testRabbitmq(@ApiParam(name = "mqMsg", value = "mq传输的值", required = true)@RequestParam String mqMsg){
		rabbitTemplate.convertAndSend(RabbitmqConfig.TEST_DIRECT_EXCHANGE, 
				RabbitmqConfig.TEST_ROUTING_KEY, mqMsg);
		Map<String,String> map = new HashMap<>();
		map.put("test", mqMsg);
		rabbitTemplate.convertAndSend(RabbitmqConfig.TEST_DIRECT_EXCHANGE, 
				RabbitmqConfig.TEST_ROUTING_KEY, map);
		return true;
		
	}
}
