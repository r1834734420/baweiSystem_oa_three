package com.bawei.mapper;

import com.bawei.pojo.Accessory;
import com.bawei.pojo.AccessoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccessoryMapper {
    int countByExample(AccessoryExample example);

    int deleteByExample(AccessoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(Accessory record);

    int insertSelective(Accessory record);

    List<Accessory> selectByExample(AccessoryExample example);

    Accessory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Accessory record, @Param("example") AccessoryExample example);

    int updateByExample(@Param("record") Accessory record, @Param("example") AccessoryExample example);

    int updateByPrimaryKeySelective(Accessory record);

    int updateByPrimaryKey(Accessory record);
}