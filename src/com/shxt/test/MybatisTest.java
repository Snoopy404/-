package com.shxt.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.shxt.dao.RoleDao;
import com.shxt.dao.UserDao;
import com.shxt.dao.impl.RoleDaoImpl;
import com.shxt.dao.impl.UserDaoImpl;
import com.shxt.model.Role;
import com.shxt.model.User;

public class MybatisTest {
	UserDao userDao = null;
	RoleDao roleDao = null; 
	@Before
	public void init() {
		userDao = new UserDaoImpl();
		 roleDao = new RoleDaoImpl();
	}
	@Test
	public void load() {
		User user = userDao.load(1);
		if(user.getFk_role_id()!=null) {
			Role role = roleDao.load(user.getFk_role_id());
			user.setRole(role);
		}
		System.out.println(user);
	}
	@Test
	public void load1() {
		User user = userDao.load(1);
		System.out.println(user);
	}
}
