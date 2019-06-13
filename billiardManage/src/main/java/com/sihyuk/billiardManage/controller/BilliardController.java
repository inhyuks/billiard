package com.sihyuk.billiardManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BilliardController {

	@GetMapping(path ="/home")
	public String initMain() {
		return "index";
	}
}
