package com.sihyuk.billiardManage.service;

import com.sihyuk.billiardManage.dto.User;

public interface UserService {
	
	public String insertUser(User user); //회원가입
	
	public int overlapChkByIdOrNickname(User user);
	
	public int getUserById(String id, String pw); //로그인 확인
}
