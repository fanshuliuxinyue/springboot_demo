package com.beyondsoft.springboot.Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





@WebFilter(filterName="customFilter",urlPatterns= {"/*"})

public class CustomFilter implements Filter{
	
	private final static Logger logger = LoggerFactory.getLogger(CustomFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		logger.info("Filter initialization....");
	}
	
	@Override
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
	throws IOException,ServletException{
		logger.info("Filter processing");
        HttpServletRequest hrequest = (HttpServletRequest)request;
        HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) response);
  
		logger.info(hrequest.getRequestURI());
		logger.info(String.valueOf((wrapper.getStatus())));
		
		chain.doFilter(request, response);
	}
	@Override
	public void destroy() {
		logger.info("Filter Destory....");
		
	}

}
