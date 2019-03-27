package com.bawei.mapper;

import com.bawei.pojo.RecipinetNotice;
import com.bawei.pojo.RecipinetNoticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecipinetNoticeMapper {
    int countByExample(RecipinetNoticeExample example);

    int deleteByExample(RecipinetNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecipinetNotice record);

    int insertSelective(RecipinetNotice record);

    List<RecipinetNotice> selectByExample(RecipinetNoticeExample example);

    RecipinetNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecipinetNotice record, @Param("example") RecipinetNoticeExample example);

    int updateByExample(@Param("record") RecipinetNotice record, @Param("example") RecipinetNoticeExample example);

    int updateByPrimaryKeySelective(RecipinetNotice record);

    int updateByPrimaryKey(RecipinetNotice record);
}