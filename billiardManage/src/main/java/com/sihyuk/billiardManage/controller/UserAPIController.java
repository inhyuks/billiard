package com.sihyuk.billiardManage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sihyuk.billiardManage.dto.User;
import com.sihyuk.billiardManage.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserAPIController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public User Post(@RequestBody User user,
			HttpServletRequest request) {
		String id = request.getRemoteAddr();
		user.setPermit(0);
		User resultUser = userService.postUser(user);
		return resultUser;
	}
}
