package com.hy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hy.base.BaseService;
import com.hy.dto.AppOrdersDto;
import com.hy.dto.AppOrdersDtoExample;
import com.hy.enums.APP_ORDER_STATUS_ENUMS;
import com.hy.mapper.ExtAppOrdersDtoMapper;
import com.hy.model.AppOrdersModel;
import com.hy.service.AppOrderService;

@Service
public class AppOrderServiceImpl extends BaseService implements AppOrderService {
	
	@Autowired
	private ExtAppOrdersDtoMapper extOrderMapper;

	@Override
	public List<AppOrdersModel> searchDownloadData(AppOrdersModel model) throws Exception {
		return extOrderMapper.searchDownloadData(model);
	}

	@Override
	public Page<AppOrdersModel> searchOrderPage(AppOrdersModel model) throws Exception {
		Page<AppOrdersModel> page =  PageHelper.startPage(model.getPageNum(), model.getPageSize(), true, true);
		PageHelper.orderBy(" create_time desc ");
		extOrderMapper.searchOrderPage(model);
		return page;
	}

	@Override
	public void synOrderInfo(String id) throws Exception {
		AppOrdersDtoExample example = new AppOrdersDtoExample();
		example.createCriteria().andIdEqualTo(Integer.parseInt(id));
		AppOrdersDto record = new AppOrdersDto();
		record.setStatus(APP_ORDER_STATUS_ENUMS.success_1.code);
		ordersDtoMapper.updateByExampleSelective(record, example);
	}

}
