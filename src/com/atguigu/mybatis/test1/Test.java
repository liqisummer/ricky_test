package com.atguigu.mybatis.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public static void main(String[] args) throws IOException{
		String resource = "conf.xml";
		//����mybatis �������ļ�����Ҳ���ع�����ӳ���ļ���
//		Reader reader = Resources.getResourceAsReader(resource);
		InputStream is = Test.class.getClassLoader().getResourceAsStream(resource);
		//����sqlSession �Ĺ���
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		//������ִ��ӳ���ļ���sql ��sqlSession
		SqlSession session = sessionFactory.openSession();
		//ӳ��sql �ı�ʶ�ַ���
		String statement = "com.atguigu.mybatis.test1.userMapper"+".getUser";
		//ִ�в�ѯ����һ��Ψһuser �����sql
		User user = session.selectOne(statement, 4);
		System.out.println(user);
	}
}
