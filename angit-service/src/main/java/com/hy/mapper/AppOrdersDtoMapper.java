package com.hy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hy.dto.AppOrdersDto;
import com.hy.dto.AppOrdersDtoExample;

@Mapper
public interface AppOrdersDtoMapper {
    int countByExample(AppOrdersDtoExample example);

    int deleteByExample(AppOrdersDtoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppOrdersDto record);

    int insertSelective(AppOrdersDto record);

    List<AppOrdersDto> selectByExample(AppOrdersDtoExample example);

    AppOrdersDto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppOrdersDto record, @Param("example") AppOrdersDtoExample example);

    int updateByExample(@Param("record") AppOrdersDto record, @Param("example") AppOrdersDtoExample example);

    int updateByPrimaryKeySelective(AppOrdersDto record);

    int updateByPrimaryKey(AppOrdersDto record);
}