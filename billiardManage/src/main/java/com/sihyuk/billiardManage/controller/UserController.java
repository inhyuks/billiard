package com.sihyuk.billiardManage.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@ResponseBody
	@PostMapping(path = "/overlapChk")
	public Map<String,Integer> overlapChk(@ModelAttribute User user) {
		int chk = userService.overlapChkByIdOrNickname(user);
		Map<String,Integer> map = new HashMap<>();
		map.put("chk", chk);
		return map;
	}
	
	@ResponseBody
	@PostMapping(path = "/login")
	public int login(@ModelAttribute User user,HttpSession session) {
		int chk = userService.getUserById(user.getId(),user.getPw());
		if (chk == 1) {
			session.setAttribute("loginUser", user.getId());
		}
		return chk;

	}
}
