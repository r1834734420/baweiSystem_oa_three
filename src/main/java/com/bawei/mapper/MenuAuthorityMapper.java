package com.bawei.mapper;

import com.bawei.pojo.MenuAuthority;
import com.bawei.pojo.MenuAuthorityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuAuthorityMapper {
    int countByExample(MenuAuthorityExample example);

    int deleteByExample(MenuAuthorityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MenuAuthority record);

    int insertSelective(MenuAuthority record);

    List<MenuAuthority> selectByExample(MenuAuthorityExample example);

    MenuAuthority selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MenuAuthority record, @Param("example") MenuAuthorityExample example);

    int updateByExample(@Param("record") MenuAuthority record, @Param("example") MenuAuthorityExample example);

    int updateByPrimaryKeySelective(MenuAuthority record);

    int updateByPrimaryKey(MenuAuthority record);
}