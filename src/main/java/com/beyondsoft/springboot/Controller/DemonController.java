package com.beyondsoft.springboot.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Api(tags="RestAPI demo")
public class DemonController {
    
    @Value("${message:Hello World}")
    private String message ;
    @GetMapping(value="/demo")
	public String demo() {
		System.out.println(this.message);
		return "Spring boot test";
	}
    @ResponseBody 
    @ApiOperation(value="测试Get方法URL参数传递")
	@SuppressWarnings("null")
	@GetMapping(value="/demo/{name}",produces = "application/json")
    public String welcome(@PathVariable String name,Map<String, Object> model) {
        Date currentTime = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String dateString = formatter.format(currentTime); 
		model.put("time", dateString);
        model.put("message", this.message);
        model.put("name", name);
        return JSON.toJSONString(model);
    }
	
}
