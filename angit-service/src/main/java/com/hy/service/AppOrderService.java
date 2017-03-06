package com.hy.service;

import java.util.List;

import com.github.pagehelper.Page;
import com.hy.model.AppOrdersModel;

public interface AppOrderService {
	/**
	 * 下载查询结果（不分页）
	 * @param model
	 * @return
	 */
  List<AppOrdersModel> searchDownloadData(AppOrdersModel model)throws Exception;
  /**
   * 分页查询订单数据（两张表查询）
   * @param model
   * @return
   * @throws Exception
   */
  Page<AppOrdersModel>  searchOrderPage(AppOrdersModel model) throws Exception;
  /**
   * 补单操作（更新状态，发送通知）
   * @param id
   * @throws Exception
   */
  void synOrderInfo(String id) throws Exception;
  
}
