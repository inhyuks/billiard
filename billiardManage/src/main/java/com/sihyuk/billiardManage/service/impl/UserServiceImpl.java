package com.sihyuk.billiardManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sihyuk.billiardManage.dao.UserDao;
import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	@Transactional(readOnly=false) // 하나라도 트랜잭션실패하면 초기화
	public String insertUser(User user) {
		userDao.insertUser(user);
		return user.getName();
	}

}
