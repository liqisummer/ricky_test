package com.atguigu.mybatis.testannotation;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.atguigu.mybatis.test1.MybatisUtils;
import com.atguigu.mybatis.test1.User;

public class TestAnnotation {
	@Test
	public void testUpdate(){
		SqlSessionFactory factory = MybatisUtils.CreateFactory();
		SqlSession session = factory.openSession(true);
		UserMapper userMapper = session.getMapper(UserMapper.class);
		userMapper.insertUser(new User(-1,"zhangxueyou",29));
	}
}
