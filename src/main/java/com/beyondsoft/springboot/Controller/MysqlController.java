package com.beyondsoft.springboot.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beyondsoft.springboot.Service.IMysqlService;

import io.swagger.annotations.Api;

@RestController
@Api(tags="Mysql Status API")
public class MysqlController {
    @Resource
    private IMysqlService imysql;
    @GetMapping(value = "/databases", produces = "application/json")
    public List<String> database_list() { // 通过model可以实现内容的传递
        return this.imysql.databasesList(); 
    }
    @GetMapping(value = "/tables", produces = "application/json")
    public List<String> table_list() { // 通过model可以实现内容的传递
        return this.imysql.tablesList(); 
    }

}
