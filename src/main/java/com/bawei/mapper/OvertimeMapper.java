package com.bawei.mapper;

import com.bawei.pojo.Overtime;
import com.bawei.pojo.OvertimeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OvertimeMapper {
    int countByExample(OvertimeExample example);

    int deleteByExample(OvertimeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Overtime record);

    int insertSelective(Overtime record);

    List<Overtime> selectByExample(OvertimeExample example);

    Overtime selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Overtime record, @Param("example") OvertimeExample example);

    int updateByExample(@Param("record") Overtime record, @Param("example") OvertimeExample example);

    int updateByPrimaryKeySelective(Overtime record);

    int updateByPrimaryKey(Overtime record);
}