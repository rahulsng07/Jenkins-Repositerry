package com.jenkins.springboot_jenkins_ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@Autowired
	@RequestMapping("/test")
	public String test()
	{
		return "This is jenkins test only";
		
	}
	@RequestMapping("/post")
	public String post()
	{
		return " Hi jenkins";
	}
	@RequestMapping("/get")
	public String get()
	{
		return "Test this";
	}
	
	

}
