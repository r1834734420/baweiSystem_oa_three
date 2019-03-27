package com.bawei.mapper;

import com.bawei.pojo.AttendanceStatistics;
import com.bawei.pojo.AttendanceStatisticsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttendanceStatisticsMapper {
    int countByExample(AttendanceStatisticsExample example);

    int deleteByExample(AttendanceStatisticsExample example);

    int deleteByPrimaryKey(String id);

    int insert(AttendanceStatistics record);

    int insertSelective(AttendanceStatistics record);

    List<AttendanceStatistics> selectByExample(AttendanceStatisticsExample example);

    AttendanceStatistics selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AttendanceStatistics record, @Param("example") AttendanceStatisticsExample example);

    int updateByExample(@Param("record") AttendanceStatistics record, @Param("example") AttendanceStatisticsExample example);

    int updateByPrimaryKeySelective(AttendanceStatistics record);

    int updateByPrimaryKey(AttendanceStatistics record);
}