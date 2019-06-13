package com.shxt.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shxt.dao.UserDao;
import com.shxt.model.User;
import com.shxt.utils.MybatisUtil;

public class UserDaoImpl implements UserDao {
	private SqlSession sqlSession = null;
	@Override
	public User load(Integer user_id) {
		try {
			sqlSession = MybatisUtil.getSqlSession();
			User user = sqlSession.selectOne(User.class.getName()+".load",user_id);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("≤È—Ø ß∞‹,"+e.getMessage());
		}finally {
			MybatisUtil.closeSqlSession(sqlSession);
		}
		
	}
	

}
