package com.beyondsoft.springboot;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@MapperScan("com.beyondsoft.springboot.Dao")
@ComponentScan(basePackages={"com.beyondsoft.springboot.Interceptor",
		"com.beyondsoft.springboot",
		"com.beyondsoft.springboot.Dao",
		"com.beyondsoft.springboot.Config",
		"com.beyondsoft.springboot.swaggerconfig"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
