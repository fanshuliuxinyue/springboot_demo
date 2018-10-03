package com.beyondsoft.springboot.Service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.beyondsoft.springboot.Model.Dept;

public interface IDeptService {
	@Transactional(readOnly = true)
	 public List<Dept> list() ;
	@Transactional(propagation=Propagation.REQUIRED)
	 public boolean add(Dept dt) ;
}
