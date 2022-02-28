package com.ait.Dao;

import java.util.List;

import com.ait.Model.User;

public interface UserDoa {

	
	boolean insertUser(User u);
	
	List<User> getAllUsers();
	
	User getUserByNameAndPassword(String name,String password);
}
