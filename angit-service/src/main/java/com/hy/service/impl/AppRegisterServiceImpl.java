package com.hy.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hy.base.BaseService;
import com.hy.common.utils.DateHelper;
import com.hy.dto.AppProtocolDto;
import com.hy.dto.AppProtocolDtoExample;
import com.hy.model.AppProtocolModel;
import com.hy.service.AppRegisterService;

@Service
public class AppRegisterServiceImpl extends BaseService implements AppRegisterService {
	private String createAppCode() {
		return DateHelper.formatDate(new Date(), "yyyyMMdd") + appProtocolDtoMapper.countByExample(null);
	}
	
	@Transactional(readOnly = false)
	@Override
	public int registerApp(AppProtocolModel model) throws Exception {
		AppProtocolDto record = new AppProtocolDto();
		record.setAppName(model.getAppName());
		record.setAppCode(createAppCode());
		record.setIpAddress(model.getIpAddress());
		record.setMd5Key(model.getMd5Key());
		record.setCreateTime(new Date());
		record.setUpdateTime(new Date());
		record.setStatus(Integer.valueOf(model.getStatus()));
		return appProtocolDtoMapper.insert(record);

	}

	@Override
	public Page<AppProtocolDto> serchAPPInfoByPage(AppProtocolModel model) throws Exception {

		Page<AppProtocolDto> page =  PageHelper.startPage(model.getPageNum(), model.getPageSize(), true, true);
		PageHelper.orderBy(" create_time desc ");
		AppProtocolDtoExample example = new AppProtocolDtoExample();
		appProtocolDtoMapper.selectByExample(example);
		return page;
	}

	@Override
	public AppProtocolModel getAPPInfoById(String id) throws Exception {
		AppProtocolDto dto = appProtocolDtoMapper.selectByPrimaryKey(Integer.parseInt(id));
		AppProtocolModel model = new AppProtocolModel();
		return model;
	}

	@Override
	public int deleteAppInfo(String id) throws Exception {
		return appProtocolDtoMapper.deleteByPrimaryKey(Integer.valueOf(id));
	}

	@Override
	public int updateAppInfo(AppProtocolModel model) {
		AppProtocolDtoExample example = new AppProtocolDtoExample();
		AppProtocolDto record = new AppProtocolDto();
		record.setAppName(model.getAppName());
		record.setAppCode(createAppCode());
		record.setIpAddress(model.getIpAddress());
		record.setMd5Key(model.getMd5Key());
		return appProtocolDtoMapper.updateByExample(record, example);
	}

}
