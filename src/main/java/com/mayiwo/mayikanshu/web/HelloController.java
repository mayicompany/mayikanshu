package com.mayiwo.mayikanshu.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


	/*
	 * 跳转前台首页
	 */
	@RequestMapping(value = "mayikanshu/index")
	public String hello(){
		return "/index.jsp";
	}





}