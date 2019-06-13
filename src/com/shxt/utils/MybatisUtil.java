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
			//���غ��������ļ�
			is = Resources.getResourceAsStream(PATH);
			//����sqlsession���� -->�൱��connection
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("����ӳ���ļ�ʧ�ܿ�������ӳ���ļ�д���ˣ�ԭ��"+e.getMessage());
			
		}
	}
	//��ȡsession -->�൱��ִ��sql������
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
	public static void closeSqlSession(SqlSession sqlSession) {
		if(sqlSession!=null) {
			sqlSession.close();
		}
	}
	
}
