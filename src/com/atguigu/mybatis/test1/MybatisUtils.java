package com.atguigu.mybatis.test1;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	public static SqlSessionFactory CreateFactory(){
		String resource = "conf.xml";
		//加载mybatis 的配置文件（它也加载关联的映射文件）
//		Reader reader = Resources.getResourceAsReader(resource);
		InputStream is = MybatisUtils.class.getClassLoader().getResourceAsStream(resource);
		//构建sqlSession 的工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sessionFactory;
	}
}
