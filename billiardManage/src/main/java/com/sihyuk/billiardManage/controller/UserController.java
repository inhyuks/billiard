package com.sihyuk.billiardManage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(path = "/userpost")
	public String write(@ModelAttribute User user) {
		userService.postUser(user);
		return "redirect:home";
	}
}
