package com.beyondsoft.springboot.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beyondsoft.springboot.Dao.IMysql;
import com.beyondsoft.springboot.Service.IMysqlService;

@Service
public class MysqlServiceImpl implements IMysqlService {
	
	@Resource
	private IMysql imysql;
	
    @Override
	public List<String> databasesList() {
		// TODO Auto-generated method stub
		return this.imysql.showDatabases();
	}

}
