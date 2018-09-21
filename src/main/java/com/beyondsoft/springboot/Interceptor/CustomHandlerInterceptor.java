package com.beyondsoft.springboot.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.beyondsoft.springboot.Filter.CustomFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomHandlerInterceptor implements HandlerInterceptor {
	private final static Logger logger = LoggerFactory.getLogger(CustomFilter.class);
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		
		logger.info("preHandle: Call before request.");
		return true;
		
	}
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndview) throws Exception
	{
		logger.info("postHandle: Call after request.");
	}
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex) throws Exception{
		logger.info("afterCompletion: Callback function after complete the request.");
		
	}
	

}
