package com.beyondsoft.springboot.Dao;

import java.util.List;
import com.beyondsoft.springboot.Model.Dept;

public interface IDeptDAO {
	public List<Dept> findAll() ;
	public boolean doCreate(Dept dt) ;

}
