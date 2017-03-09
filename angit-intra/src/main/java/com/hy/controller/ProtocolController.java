package com.hy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.hy.model.AppProtocolModel;
import com.hy.service.AppRegisterService;

@RestController
@RequestMapping("/protocol")
public class ProtocolController {
	
	@Autowired
	private AppRegisterService appRegisterService;

	@PostMapping(value = "saveData")
	public AppProtocolModel saveData(@RequestBody JSONObject requestJson) throws Exception {
		AppProtocolModel protocol = new AppProtocolModel();
		protocol.setAppName(requestJson.getString("appname"));
		protocol.setIpAddress(requestJson.getString("ipaddress"));
		protocol.setMd5Key(requestJson.getString("md5key"));
		protocol.setStatus("0");
		appRegisterService.registerApp(protocol);
		return protocol;
	}
	
	@GetMapping(value = "listData")
	public AppProtocolModel listData(@RequestBody JSONObject requestJson) throws Exception {
		AppProtocolModel protocol = new AppProtocolModel();
		protocol.setAppName(requestJson.getString("appname"));
		protocol.setIpAddress(requestJson.getString("ipaddress"));
		protocol.setMd5Key(requestJson.getString("md5key"));
		protocol.setStatus("0");
		appRegisterService.registerApp(protocol);
		return protocol;
	}
	

}
