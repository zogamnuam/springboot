package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@RequestMapping("/list")
	public String list(){
		return "list posts....";
	}
	
	@RequestMapping("/admin/posts/create")
	public String addPost(){
		return "add posts....";
	}

}
