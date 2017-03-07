package com.hy.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homepage() {
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("/user")
	public Map<String, Object> user() {
		Map<String, Object> model = new HashMap<String, Object>();
		return model;
	}

	@ResponseBody
	@RequestMapping("/resource")
	public Map<String, Object> resource() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		return model;
	}

}
