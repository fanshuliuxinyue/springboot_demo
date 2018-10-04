package com.beyondsoft.springboot.Service;

import java.util.List;

public interface IMysqlService {
	public List<String> databasesList() ;
	public List<String> tablesList() ;
}
