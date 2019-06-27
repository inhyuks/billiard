package com.sihyuk.billiardManage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sihyuk.billiardManage.dao.BilliardDao;
import com.sihyuk.billiardManage.dto.Billiard;
import com.sihyuk.billiardManage.service.BilliardService;

@Service
public class BilliardServiceImpl implements BilliardService{

	@Autowired
	BilliardDao billiardDao;
	
	@Override
	//내부적으로 ReadOnly라는 형태로 커넥션적용
	@Transactional
	public List<Billiard> getBilliards(Integer start) {
		List<Billiard> list = billiardDao.selectAll(start,BilliardService.LIMIT);
		return list;
	}// 목록가져오기

	@Override
	@Transactional(readOnly = false)
	public int getBilliardCount() {
		return billiardDao.selectBilliardCount();
	}// 방명록 전체개수
}
