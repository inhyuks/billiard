package com.sihyuk.billiardManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@Controller
public class MainController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value ="/home" , method = {RequestMethod.GET, RequestMethod.POST})
	public String initMain() {
		return "index";
	}
	
	@GetMapping(path = "/login") //로그인페이지이동
	public String loginPage() {
		return "userLogin";
	}
	
	@GetMapping(path = "/regist") //회원가입페이지이동
	public String registPage() {
		return "regist";
	}

}
