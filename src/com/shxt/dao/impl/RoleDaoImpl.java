package com.shxt.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.shxt.dao.RoleDao;
import com.shxt.model.Role;
import com.shxt.utils.MybatisUtil;

public class RoleDaoImpl implements RoleDao {
	private SqlSession sqlSession = null;
	@Override
	public Role load(Integer role_id) {
		try {
			sqlSession = MybatisUtil.getSqlSession();
			Role role = sqlSession.selectOne(Role.class.getName()+".load",role_id);
			return role;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("≤È—Ø ß∞‹,"+e.getMessage());
		}finally {
			MybatisUtil.closeSqlSession(sqlSession);
		}
		
	}
	

}
