package com.yk.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务启动类
 * @author zebra
 * @date 2019年12月11日 上午9:34:08
 */
@MapperScan("com.yk.demo.dao")
@SpringBootApplication
public class DemoApplication {
	private static final Logger logger= LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		logger.error("服务启动成功");
	}

}
