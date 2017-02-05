package com.niit.dao;

import com.niit.model.User;

public interface UserDAO {
	public boolean save (User user);
	
	public boolean update (User user);
	
	public boolean delete (User user);
	
  public List <User> list();
  
	 public boolean isValidUser(String )

}


