package com.sihyuk.billiardManage.service.impl;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sihyuk.billiardManage.config.ApplicationConfig;
import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;


public class UserServiceImpleTest {
	public static void main(String[] arg) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		UserService userService = ac.getBean(UserService.class);
		
		User user = new User();
		user.setAvg(1);
		user.setId("512312");
		user.setName("ddlds");
		user.setPw("512321");
		user.setNickname("gkfnzktm");
		user.setnTel("12312");
		user.setPermit(123);
		User result = userService.postUser(user);
		System.out.println(result);
	}
}
