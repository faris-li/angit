package com.hy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.hy.model.AppOrdersModel;
import com.hy.service.AppOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private AppOrderService appOrderService;

	@GetMapping(value = "synAppOrders/{id}/{status}")
	public ResponseEntity synAppOrders(@PathVariable("id") String id,@PathVariable("status") String status) throws Exception {
		appOrderService.synAppOrders(id, status);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping(value = "listData")
	public PageInfo<AppOrdersModel> listData(AppOrdersModel model) throws Exception {
		return appOrderService.searchOrderPage(model);
	}
	
	@GetMapping(value = "getData/{id}")
	public AppOrdersModel getData(@PathVariable("id") String id) throws Exception {
		return appOrderService.getAppOrdersModel(id);
	}


}
