package com.sihyuk.billiardManage.service;

import java.util.List;

import com.sihyuk.billiardManage.dto.Billiard;

public interface BilliardService {

	//한페이지내 최대 게시글수에대한 상수
	public static final Integer LIMIT = 7;
	
	//당구 매장 정보 가져오기
	public List<Billiard> getBilliards(Integer start);
	
	//당구 매장 전체개수
	public int getBilliardCount();
}
