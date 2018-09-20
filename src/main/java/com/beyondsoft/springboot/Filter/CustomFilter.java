package com.beyondsoft.springboot.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import lombok.extern.slf4j.Slf4j;



@WebFilter(filterName="customFilter",urlPatterns= {"/*"})
@Slf4j
public class CustomFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
	    log.
	}
	
	@Override
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
	throws IOException,ServletException{
		chain.doFilter(request, response);
	}
	@Override
	public void destroy() {
		
	}

}
