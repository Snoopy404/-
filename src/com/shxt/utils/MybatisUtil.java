package com.shxt.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public final class MybatisUtil {
	private MybatisUtil() {}
	private static final String PATH="mybatis-config.xml";
	private static InputStream is = null;
	private static SqlSessionFactory sqlSessionFactory = null;
	static {
		try {
			//加载核心配置文件
			is = Resources.getResourceAsStream(PATH);
			//创建sqlsession工厂 -->相当于connection
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("加载映射文件失败可能是你映射文件写错了，原因："+e.getMessage());
			
		}
	}
	//获取session -->相当于执行sql语句对象
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
	public static void closeSqlSession(SqlSession sqlSession) {
		if(sqlSession!=null) {
			sqlSession.close();
		}
	}
	
}
