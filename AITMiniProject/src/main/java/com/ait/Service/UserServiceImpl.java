package com.ait.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ait.Dao.UserDoa;
import com.ait.Model.User;



@Service
public class UserServiceImpl implements UserService{
	

	@Autowired
	private UserDoa udao;

	@Override
	public boolean insertUser(User u) {
	    udao.insertUser(u);
	    return true;
	}

	@Override
	public List<User> getAllUsers() {
		return udao.getAllUsers();
	}
	
	@Override
	public User getUserByNameAndPassword(String name, String password) {
		User u=udao.getUserByNameAndPassword(name, password);
		return u;
	}
	

}
