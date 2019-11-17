package com.kmenpin.yatodo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todo")
public class Todo {
	
	@RequestMapping("index")
	public String index(ModelMap map) throws IOException {
		return ("index");
	}

	@RequestMapping("edit")
	public String edit(ModelMap map) throws IOException {
		
		Map<String, Object> root = new HashMap<String, Object>();
		Map<String, Object> user = new HashMap<String, Object>();
//		root.put("user", user);
		user.put("usertype", 2);
		user.put("username", "Rocky Ou");
		
		map.addAttribute("user", user);
//		map.addAttribute("product", false);
		
		map.addAttribute("name", "Rocky ¿ò¼Ü");
		return "publish";
	}
}