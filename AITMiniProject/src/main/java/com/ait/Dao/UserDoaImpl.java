package com.ait.Dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ait.Model.Product;
import com.ait.Model.Role;
import com.ait.Model.User;


@Repository
@Transactional
public class UserDoaImpl implements UserDoa {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean insertUser(User u) {
		System.out.println("**************" + u);

		Role r = sessionFactory.getCurrentSession().find(Role.class, 2);
		u.setRole(r);
		sessionFactory.getCurrentSession().save(u);
		return true;
	}

	@Override
	public List<User> getAllUsers() {
		Query<User> q=sessionFactory.getCurrentSession().createQuery("from User");
		List<User> userlist=q.list();
		return userlist;
	}
	
	@Override
	public User getUserByNameAndPassword(String name, String password) {
		String query = "from User u where userName=:n and userpassword=:p";
		Query  q = sessionFactory.getCurrentSession().createQuery(query);
		q.setParameter("n", name);
		q.setParameter("p", password);
		q.setMaxResults(1);
		User u = (User) q.uniqueResult();

		return u;
	}

}
