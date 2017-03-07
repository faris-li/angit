package com.hy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hy.model.AppOrdersModel;

@Mapper
public interface ExtAppOrdersDtoMapper {
  
    /**
     * 查询导出结果
     * @param model
     * @return
     */
    List<AppOrdersModel> searchDownloadData(AppOrdersModel model);
    /**
     * 页面显示分页查询
     * @param model
     * @return
     */
    List<AppOrdersModel> searchOrderPage(AppOrdersModel model);
    
    int countByExample(AppOrdersModel model);
}

