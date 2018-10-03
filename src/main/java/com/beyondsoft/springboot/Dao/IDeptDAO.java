package com.beyondsoft.springboot.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.beyondsoft.springboot.Model.Dept;

@Mapper
public interface IDeptDAO {
	public List<Dept> findAll() ;
	public boolean doCreate(Dept dt) ;

}
