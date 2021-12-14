package com.shubham.learning.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringFrameworkApplication.class, args);
		GamingConsole runner = applicationContext.getBean(GamingConsole.class);
		runner.run();
	}

}
