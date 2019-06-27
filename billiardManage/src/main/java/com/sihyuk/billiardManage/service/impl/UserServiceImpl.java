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
	} //유저등록

	@Override
	public int overlapChkByIdOrNickname(User user) {
		return userDao.overlapChk(user);
	} // 중복확인
	
	public int getUserById(String id, String pw) {
		User user = userDao.getUserById(id,pw);
		if(user == null) { // 동일한 id가없으면 -1 을 리턴
			return -1;
		}
		else if(user.getPw().equals(pw)) { // 동일한 id의 비밀번호와 일치하다면 1을 리턴
			return 1; 
		}
		else { // id 가있으나 pw가 다르다면 0을 리턴
			return 0;
		}
	} // id 를 이용한 유저검색

}
