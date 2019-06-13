package com.sihyuk.billiardManage.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@Controller
public class UserAPIController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public String PostUser(@RequestBody User user,HttpServletRequest request) {
		user.setPermit(0);
		Long id = userService.postUser(user);
		request.setAttribute("id", id);
		return "home";
	}
}
