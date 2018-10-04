package com.beyondsoft.springboot.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.beyondsoft.springboot.Model.Dept;
import com.beyondsoft.springboot.Service.IDeptService;

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
    public String welcome(@PathVariable String name) {
    	Map<String, Object> model = new HashMap<String,Object>();
        Date currentTime = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String dateString = formatter.format(currentTime); 
		model.put("time", dateString);
        model.put("message", this.message);
        model.put("name", name);
        return JSON.toJSONString(model);
    }
    
    @Resource
    private IDeptService deptService ;
    @GetMapping(value = "/list", produces = "application/json")
    public List<Dept> list() { // 通过model可以实现内容的传递
        return this.deptService.list() ; 
    }
}
