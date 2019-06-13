package com.sihyuk.billiardManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sihyuk.billiardManage.dao.UserDao;
import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public long postUser(User user) {
		return userDao.postUser(user);
	}

}
