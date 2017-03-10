package com.hy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	public AppProtocolDto registerApp(AppProtocolModel model) throws Exception {
		AppProtocolDto record = new AppProtocolDto();
		record.setAppName(model.getAppName());
		record.setAppCode(createAppCode());
		record.setIpAddress(model.getIpAddress());
		record.setMd5Key(model.getMd5Key());
		record.setCreateTime(new Date());
		record.setUpdateTime(new Date());
		record.setStatus(Integer.valueOf(model.getStatus()));
		appProtocolDtoMapper.insert(record);
		return record;

	}

	@Override
	public PageInfo<AppProtocolDto> serchAPPInfoByPage(AppProtocolModel model) throws Exception {
		PageHelper.startPage(model.getPageNum(), model.getPageSize(), true, true);
		PageHelper.orderBy(" create_time desc ");
		AppProtocolDtoExample example = new AppProtocolDtoExample();
		if(model.getAppName()!=null&&model.getAppName().length()>0){
			example.or().andAppNameLike("%"+model.getAppName()+"%");
		}
		List<AppProtocolDto> list = appProtocolDtoMapper.selectByExample(example);
		return new PageInfo<>(list);
	}

	@Override
	public AppProtocolDto getAPPInfoById(String id) throws Exception {
		return appProtocolDtoMapper.selectByPrimaryKey(Integer.parseInt(id));
	}

	@Transactional(readOnly = false)
	@Override
	public int deleteAppInfo(String id) throws Exception {
		return appProtocolDtoMapper.deleteByPrimaryKey(Integer.valueOf(id));
	}

	@Transactional(readOnly = false)
	@Override
	public AppProtocolDto updateAppInfo(AppProtocolModel model) {
		AppProtocolDtoExample example = new AppProtocolDtoExample();
		example.or().andIdEqualTo(Integer.valueOf(model.getId()));
		AppProtocolDto record = new AppProtocolDto();
		record.setAppName(model.getAppName());
		record.setAppCode(createAppCode());
		record.setIpAddress(model.getIpAddress());
		record.setMd5Key(model.getMd5Key());
		record.setId(Integer.valueOf(model.getId()));
		record.setUpdateTime(new Date());
		record.setStatus(Integer.valueOf(model.getStatus()));
		appProtocolDtoMapper.updateByExample(record, example);
		return record;
	}

}
