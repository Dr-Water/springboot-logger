package com.ratel.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoggerApplication.class, args);
		System.out.println("启动成功");
	}

}
