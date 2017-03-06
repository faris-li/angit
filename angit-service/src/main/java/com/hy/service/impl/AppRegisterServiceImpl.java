package com.hy.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

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
		return DateHelper.formatDate(new Date(), "yyOyyMMdd") + appProtocolDtoMapper.countByExample(null);
	}

	@Override
	public int registerApp(AppProtocolModel model) throws Exception {
		AppProtocolDto record = dozerBean().map(model, AppProtocolDto.class);
		record.setAppCode(createAppCode());
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
		AppProtocolModel model = dozerBean().map(dto, AppProtocolModel.class);
		return model;
	}

	@Override
	public int deleteAppInfo(String id) throws Exception {
		return appProtocolDtoMapper.deleteByPrimaryKey(Integer.valueOf(id));
	}

	@Override
	public int updateAppInfo(AppProtocolModel model) {
		AppProtocolDtoExample example = new AppProtocolDtoExample();
		AppProtocolDto record = dozerBean().map(model, AppProtocolDto.class);
		return appProtocolDtoMapper.updateByExample(record, example);
	}

}
