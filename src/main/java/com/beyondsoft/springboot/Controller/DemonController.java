package com.beyondsoft.springboot.Controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;


@RestController
public class DemonController {
    
    @Value("${message:Hello World}")
    private String message ;
    @GetMapping(value="/demo")
	public String demo() {
		System.out.println(this.message);
		return "Spring boot test";
	}
    @ResponseBody 
	@SuppressWarnings("null")
	@GetMapping(value="/demo/{name}")
    public String welcome(@PathVariable String name,Map<String, Object> model) {
		model.put("time", new Date());
        model.put("message", this.message);
        model.put("name", name);
        return JSON.toJSONString(model);
    }
	
}
