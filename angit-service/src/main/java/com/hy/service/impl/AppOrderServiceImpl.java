package com.hy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	public PageInfo<AppOrdersModel> searchOrderPage(AppOrdersModel model) throws Exception {
		PageHelper.startPage(model.getPageNum(), model.getPageSize(), true, true);
		PageHelper.orderBy(" create_time desc ");
		List<AppOrdersModel> list = extOrderMapper.searchOrderPage(model);
		return new PageInfo<>(list);
	}
	
	public AppOrdersModel getAppOrdersModel(String id) throws Exception {
		AppOrdersModel model = new AppOrdersModel();
		model.setId(id);
		List<AppOrdersModel> list = extOrderMapper.searchOrderPage(model);
		if(list!=null&&list.size()>=1){
			return list.get(0);
		}
		return null;
	}

	@Transactional(readOnly = false)
	@Override
	public void synOrderInfo(String id) throws Exception {
		AppOrdersDtoExample example = new AppOrdersDtoExample();
		example.createCriteria().andIdEqualTo(Integer.parseInt(id));
		AppOrdersDto record = new AppOrdersDto();
		record.setStatus(APP_ORDER_STATUS_ENUMS.success_1.code);
		ordersDtoMapper.updateByExampleSelective(record, example);
	}
	
	@Transactional(readOnly = false)
	public int synAppOrders(String id,String status) throws Exception{
		AppOrdersDtoExample example = new AppOrdersDtoExample();
		example.createCriteria().andIdEqualTo(Integer.parseInt(id));
		AppOrdersDto record = new AppOrdersDto();
		record.setStatus(Integer.parseInt(status));
		record.setUpateTime(new Date());
		return ordersDtoMapper.updateByExampleSelective(record, example);
	}

}
