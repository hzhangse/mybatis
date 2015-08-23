package com.javatrain.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatrain.service.UserInfoService;

public class SpringMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContent*.xml");
		UserInfoService userInfoService = (UserInfoService) context.getBean("userInfoService");
		System.out.println(userInfoService.getUserInfo(1).getUsername());
	}

}
