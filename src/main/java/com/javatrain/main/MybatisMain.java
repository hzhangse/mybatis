package com.javatrain.main;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.javatrain.dao.UserInfoMapper;

public class MybatisMain {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		
//		UserInfo userInfo = sqlSessionFactory.openSession().selectOne(
//				"UserInfo.getUserInfo", 11);
//		
//		System.out.println(userInfo.getId());
//		sqlSessionFactory.getConfiguration().addMapper(UserInfoMapper.class);
				
		UserInfoMapper mapper = sqlSessionFactory.openSession().getMapper(UserInfoMapper.class);
		System.out.println(mapper.getUserInfo(1).getUsername());
	}
}
