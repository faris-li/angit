package com.hy.controller;

import javax.validation.Valid;

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

import com.github.pagehelper.PageInfo;
import com.hy.dto.AppProtocolDto;
import com.hy.model.AppProtocolModel;
import com.hy.service.AppRegisterService;

@RestController
@RequestMapping("/protocol")
public class ProtocolController {
	
	@Autowired
	private AppRegisterService appRegisterService;

	@PostMapping(value = "saveData")
	public AppProtocolDto saveData(@Valid @RequestBody AppProtocolModel protocol) throws Exception {
		protocol.setStatus("0");
		return appRegisterService.registerApp(protocol);
	}
	
	@PostMapping(value = "updateData")
	public AppProtocolDto updateData(@Valid @RequestBody AppProtocolModel protocol) throws Exception {
		return appRegisterService.updateAppInfo(protocol);
	}
	
	@GetMapping(value = "listData")
	public PageInfo<AppProtocolDto> listData(AppProtocolModel model) throws Exception {
		return appRegisterService.serchAPPInfoByPage(model);
	}
	
	@GetMapping(value = "getData/{id}")
	public AppProtocolDto getData(@PathVariable("id") String id) throws Exception {
		return appRegisterService.getAPPInfoById(id);
	}
	
	@DeleteMapping(value = "delete/{id}")
    public ResponseEntity delete(@PathVariable("id") String id) throws Exception {

		appRegisterService.deleteAppInfo(id);

        return new ResponseEntity(HttpStatus.OK);
    }

}
