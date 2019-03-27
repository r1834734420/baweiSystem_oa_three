package com.bawei.mapper;

import com.bawei.pojo.Examine;
import com.bawei.pojo.ExamineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamineMapper {
    int countByExample(ExamineExample example);

    int deleteByExample(ExamineExample example);

    int deleteByPrimaryKey(String id);

    int insert(Examine record);

    int insertSelective(Examine record);

    List<Examine> selectByExample(ExamineExample example);

    Examine selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Examine record, @Param("example") ExamineExample example);

    int updateByExample(@Param("record") Examine record, @Param("example") ExamineExample example);

    int updateByPrimaryKeySelective(Examine record);

    int updateByPrimaryKey(Examine record);
}