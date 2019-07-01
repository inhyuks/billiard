package com.sihyuk.billiardManage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.sihyuk.billiardManage.dto.Billiard;
import com.sihyuk.billiardManage.service.BilliardService;

@Controller
public class BilliardController {
	
	@Autowired
	BilliardService billiardService;
	
	@GetMapping(path = "/billiardList")
	public String list(@RequestParam(name="start", required=false, defaultValue="0") int start,
			   ModelMap model) {
		//start로 시작하는 방명록개수구하기
		List<Billiard> list = billiardService.getBilliards(start);
		
		//전체페이지수 구하기
		int count = billiardService.getBilliardCount();
		int pageCount = count / billiardService.LIMIT;
		if(count % billiardService.LIMIT > 0)
			pageCount++;
		
		// 페이지 수만큼 start의 값을 리스트로 저장
		// 예를 들면 페이지수가 3이면
		// 0, 5, 10 이렇게 저장된다.
		// list?start=0 , list?start=5, list?start=10 으로 링크가 걸린다.
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * billiardService.LIMIT);
		}
		
		model.addAttribute("list",list);
		model.addAttribute("pageStartList",pageStartList);
		model.addAttribute("count",count);
		return "billiardList";
	}// 당구 매장 전체 리스트
	
	@GetMapping(path ="/billiardSearch", produces="text/plain;charset=UTF-8")
	public String billiardSearch(@RequestParam(name="start", required=false, defaultValue="0") int start, 
			@RequestParam(name="searchType") String type, 
			@RequestParam(name="searchContent") String content, ModelMap model ) {
		//start로 시작하는 방명록개수구하기
		List<Billiard> list = billiardService.getBilliardsByName(start, content);
		
		//전체페이지수 구하기
		int count = billiardService.getBilliardCountByName(content);
		int pageCount = count / billiardService.LIMIT;
		if(count % billiardService.LIMIT > 0)
			pageCount++;
		
		// 페이지 수만큼 start의 값을 리스트로 저장
		// 예를 들면 페이지수가 3이면
		// 0, 5, 10 이렇게 저장된다.
		// list?start=0 , list?start=5, list?start=10 으로 링크가 걸린다.
		List<Integer> pageStartList = new ArrayList<>();
		for(int i = 0; i < pageCount; i++) {
			pageStartList.add(i * billiardService.LIMIT);
		}
		
		model.addAttribute("list",list);
		model.addAttribute("pageStartList",pageStartList);
		model.addAttribute("count",count);
		model.addAttribute("type", type);
		model.addAttribute("content", content);
		return "billiardList";
	}// 당구 매장 검색
}
