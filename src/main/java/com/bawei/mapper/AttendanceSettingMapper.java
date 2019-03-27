package com.bawei.mapper;

import com.bawei.pojo.AttendanceSetting;
import com.bawei.pojo.AttendanceSettingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttendanceSettingMapper {
    int countByExample(AttendanceSettingExample example);

    int deleteByExample(AttendanceSettingExample example);

    int deleteByPrimaryKey(String id);

    int insert(AttendanceSetting record);

    int insertSelective(AttendanceSetting record);

    List<AttendanceSetting> selectByExample(AttendanceSettingExample example);

    AttendanceSetting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AttendanceSetting record, @Param("example") AttendanceSettingExample example);

    int updateByExample(@Param("record") AttendanceSetting record, @Param("example") AttendanceSettingExample example);

    int updateByPrimaryKeySelective(AttendanceSetting record);

    int updateByPrimaryKey(AttendanceSetting record);
}