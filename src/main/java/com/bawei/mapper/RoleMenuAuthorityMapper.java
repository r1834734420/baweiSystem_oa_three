package com.bawei.mapper;

import com.bawei.pojo.RoleMenuAuthority;
import com.bawei.pojo.RoleMenuAuthorityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMenuAuthorityMapper {
    int countByExample(RoleMenuAuthorityExample example);

    int deleteByExample(RoleMenuAuthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenuAuthority record);

    int insertSelective(RoleMenuAuthority record);

    List<RoleMenuAuthority> selectByExample(RoleMenuAuthorityExample example);

    RoleMenuAuthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleMenuAuthority record, @Param("example") RoleMenuAuthorityExample example);

    int updateByExample(@Param("record") RoleMenuAuthority record, @Param("example") RoleMenuAuthorityExample example);

    int updateByPrimaryKeySelective(RoleMenuAuthority record);

    int updateByPrimaryKey(RoleMenuAuthority record);
}