package com.hy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hy.dto.SysReqLogDto;
import com.hy.dto.SysReqLogDtoExample;

@Mapper
public interface SysReqLogDtoMapper {
    int countByExample(SysReqLogDtoExample example);

    int deleteByExample(SysReqLogDtoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysReqLogDto record);

    int insertSelective(SysReqLogDto record);

    List<SysReqLogDto> selectByExample(SysReqLogDtoExample example);

    SysReqLogDto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysReqLogDto record, @Param("example") SysReqLogDtoExample example);

    int updateByExample(@Param("record") SysReqLogDto record, @Param("example") SysReqLogDtoExample example);

    int updateByPrimaryKeySelective(SysReqLogDto record);

    int updateByPrimaryKey(SysReqLogDto record);
}