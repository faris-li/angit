package com.hy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hy.dto.AppProtocolDto;
import com.hy.dto.AppProtocolDtoExample;

@Mapper
public interface AppProtocolDtoMapper {
    int countByExample(AppProtocolDtoExample example);

    int deleteByExample(AppProtocolDtoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppProtocolDto record);

    int insertSelective(AppProtocolDto record);

    List<AppProtocolDto> selectByExample(AppProtocolDtoExample example);

    AppProtocolDto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppProtocolDto record, @Param("example") AppProtocolDtoExample example);

    int updateByExample(@Param("record") AppProtocolDto record, @Param("example") AppProtocolDtoExample example);

    int updateByPrimaryKeySelective(AppProtocolDto record);

    int updateByPrimaryKey(AppProtocolDto record);
}