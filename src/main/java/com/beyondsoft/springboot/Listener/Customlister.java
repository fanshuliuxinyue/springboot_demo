package com.beyondsoft.springboot.Listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beyondsoft.springboot.Filter.CustomFilter;

@WebListener
public class Customlister implements ServletRequestListener {
	
	private final static Logger logger = LoggerFactory.getLogger(CustomFilter.class);

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		logger.info("CustomerListener Destroyed....");

	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		logger.info("CustomerListener initialization....");

	}

}
