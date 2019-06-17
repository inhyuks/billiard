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
public class BilliardController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value ="/home" , method = {RequestMethod.GET, RequestMethod.POST})
	public String initMain() {
		return "index";
	}
	
	@GetMapping(path = "/regist")
	public String registPage() {
		return "regist";
	}
	
	@PostMapping(path = "/userpost")
	public String write(@ModelAttribute User user) {
		userService.postUser(user);
		return "redirect:home";
	}
}
