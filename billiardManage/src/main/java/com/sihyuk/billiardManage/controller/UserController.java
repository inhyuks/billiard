package com.sihyuk.billiardManage.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(path = "/userpost")
	public String write(@ModelAttribute User user) {
		userService.insertUser(user);
		return "redirect:home";
	}
	
	@ResponseBody
	@PostMapping(path = "/regist")
	public String regist(@ModelAttribute User user) {
		String userName = userService.insertUser(user);
		return userName;
	}
	
	@ResponseBody
	@PostMapping(path = "/overlapChk")
	public Map<String,Integer> overlapChk(@ModelAttribute User user) {
		int chk = userService.overlapChkByIdOrNickname(user);
		Map<String,Integer> map = new HashMap<>();
		map.put("chk", chk);
		return map;
	}
}
