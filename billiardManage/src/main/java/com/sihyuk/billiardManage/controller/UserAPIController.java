package com.sihyuk.billiardManage.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserAPIController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public String regist(@RequestBody User user) {
		String userName = userService.insertUser(user);
		return userName;
	}
}
