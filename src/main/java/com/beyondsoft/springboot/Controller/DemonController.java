package com.beyondsoft.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemonController {
    
	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public String demo() {
		return "Spring boot test";
	}
}
