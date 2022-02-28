package com.ait.Service;

import java.util.List;

import com.ait.Model.User;

public interface UserService {
	
    boolean insertUser(User u);
	
	List<User> getAllUsers();
	
	User getUserByNameAndPassword(String name,String password);

}
