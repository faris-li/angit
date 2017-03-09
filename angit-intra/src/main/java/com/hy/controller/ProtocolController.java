package com.hy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.hy.dto.AppProtocolDto;
import com.hy.model.AppProtocolModel;
import com.hy.service.AppRegisterService;

@RestController
@RequestMapping("/protocol")
public class ProtocolController {
	
	@Autowired
	private AppRegisterService appRegisterService;

	@PostMapping(value = "saveData")
	public AppProtocolDto saveData(@RequestBody JSONObject requestJson) throws Exception {
		AppProtocolModel protocol = new AppProtocolModel();
		protocol.setAppName(requestJson.getString("appname"));
		protocol.setIpAddress(requestJson.getString("ipaddress"));
		protocol.setMd5Key(requestJson.getString("md5key"));
		protocol.setStatus("0");
		return appRegisterService.registerApp(protocol);
	}
	
	@PostMapping(value = "updateData")
	public AppProtocolDto updateData(@RequestBody JSONObject requestJson) throws Exception {
		AppProtocolModel protocol = new AppProtocolModel();
		protocol.setAppName(requestJson.getString("appname"));
		protocol.setIpAddress(requestJson.getString("ipaddress"));
		protocol.setMd5Key(requestJson.getString("md5key"));
		protocol.setStatus(requestJson.getString("status"));
		protocol.setId(requestJson.getString("id"));
		return appRegisterService.updateAppInfo(protocol);
	}
	
	@GetMapping(value = "listData")
	public Page<AppProtocolDto> listData(@RequestBody JSONObject requestJson) throws Exception {
		AppProtocolModel protocol = new AppProtocolModel();
		protocol.setAppName(requestJson.getString("appname"));
//		protocol.setPageSize();
		return appRegisterService.serchAPPInfoByPage(protocol);
	}
	
	@GetMapping(value = "getData/{id}")
	public AppProtocolModel getData(@PathVariable("id") String id) throws Exception {
		return appRegisterService.getAPPInfoById(id);
	}
	
	@DeleteMapping(value = "delete/{id}")
    public ResponseEntity delete(@PathVariable("id") String id) throws Exception {

		appRegisterService.deleteAppInfo(id);

        return new ResponseEntity(HttpStatus.OK);
    }

}
