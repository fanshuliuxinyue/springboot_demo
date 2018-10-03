package com.beyondsoft.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages={"com.beyondsoft.springboot.Interceptor",
		"com.beyondsoft.springboot",
		"com.beyondsoft.springboot.Dao",
		"com.beyondsoft.springboot.swaggerconfig"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
