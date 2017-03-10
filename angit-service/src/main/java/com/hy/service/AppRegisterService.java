package com.hy.service;


import com.github.pagehelper.PageInfo;
import com.hy.dto.AppProtocolDto;
import com.hy.model.AppProtocolModel;

public interface AppRegisterService {
	/**
	 * 注册
	 * @param model
	 * @return
	 */
	public AppProtocolDto registerApp(AppProtocolModel model) throws Exception;
	/**
	 * 分页查询
	 * @return
	 */
	public PageInfo<AppProtocolDto> serchAPPInfoByPage(AppProtocolModel model) throws Exception ;
	
	/**
	 * 通过ID查询
	 * @param ID
	 * @return
	 */
	public AppProtocolDto getAPPInfoById(String id) throws Exception ;
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	public int deleteAppInfo(String id)throws Exception;
	/**
	 * 更新app
	 * @param model
	 * @return
	 */
	public AppProtocolDto updateAppInfo(AppProtocolModel model)throws Exception;
		
	
	

}
