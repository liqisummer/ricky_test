package com.atguigu.mybatis.test1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

public class Test_CRUD {
	
	SqlSessionFactory factory;
	SqlSession session;
	
	@Before
	public void init(){
		factory = MybatisUtils.CreateFactory();
		session = factory.openSession();
	}
	
	@Test
	public void testAdd(){
		session.insert("com.atguigu.mybatis.test1.userMapper"+".insertUser",new User(-1,"Lucy", 23));
		session.commit();
	}
	
	@Test
	public void testDelete(){
		session.delete("com.atguigu.mybatis.test1.userMapper"+".deleteUser", 1);
		session.commit();
	}
	
	@Test
	public void testUpdate(){
		session.update("com.atguigu.mybatis.test1.userMapper"+".updateUser",new User(4,"liudehua", 23));
		session.commit();
	}
	
	@Test
	public void testSelectAll(){
		List<User> userList = session.selectList("com.atguigu.mybatis.test1.userMapper"+".selectAllUsers");
		System.out.println(userList);
		session.commit();
	}
}
