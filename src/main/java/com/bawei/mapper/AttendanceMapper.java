package com.bawei.mapper;

import com.bawei.pojo.Attendance;
import com.bawei.pojo.AttendanceExample;
import com.bawei.utils.PageView;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttendanceMapper {
    int countByExample(AttendanceExample example);

    int deleteByExample(AttendanceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    List<Attendance> selectByExample(AttendanceExample example);

    Attendance selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByExample(@Param("record") Attendance record, @Param("example") AttendanceExample example);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);

    List<Attendance> findAttendanceList(@Param("id") String id, @Param("signInStr") String signInStr, @Param("signOutStr") String signOutStr);

    List<Attendance> attendanceList(@Param("userId") String userId, @Param("signInStr") String signInStr, @Param("signOutStr") String signOutStr);

    List<Attendance> attendanceLists(@Param("id") String id, @Param("signInStr") String signInStr, @Param("signOutStr") String signOutStr);

    Attendance checkLoginIn(@Param("id") String id,@Param("formatDate") String formatDate);
}