package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {	
	
		
	@RequestMapping("/admin/category")
	public String indexcategory() {
		return "category";
	}
	
	@RequestMapping("/admin/category/list")
	public String indexlist() {
		return "list";
	}
	
	@RequestMapping("/admin/category/edit")
	public String indexedit() {
		return "edit";
	}
	
}
	