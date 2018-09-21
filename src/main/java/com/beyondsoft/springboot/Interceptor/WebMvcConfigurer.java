package com.beyondsoft.springboot.Interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@SuppressWarnings("deprecation")
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(getHandlerInterceptor()).addPathPatterns("/**");
		
	}
	
	@Bean
	public HandlerInterceptor getHandlerInterceptor() {
		return new CustomHandlerInterceptor();
	}

}
