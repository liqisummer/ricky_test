package com.atguigu.mybatis.test1;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	public static SqlSessionFactory CreateFactory(){
		String resource = "conf.xml";
		//����mybatis �������ļ�����Ҳ���ع�����ӳ���ļ���
//		Reader reader = Resources.getResourceAsReader(resource);
		InputStream is = MybatisUtils.class.getClassLoader().getResourceAsStream(resource);
		//����sqlSession �Ĺ���
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sessionFactory;
	}
}
