package com.beyondsoft.springboot.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beyondsoft.springboot.Dao.IDeptDAO;
import com.beyondsoft.springboot.Model.Dept;
import com.beyondsoft.springboot.Service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {
	@Resource
	private IDeptDAO deptDAO;

	@Override
	public List<Dept> list() {
		// TODO Auto-generated method stub
		return this.deptDAO.findAll();
	}

}
