package com.bawei.service;

import com.bawei.pojo.Attendance;
import com.bawei.utils.PageView;

import java.text.ParseException;

public interface AttendanceService {

    PageView<Attendance> attendanceList(String id, String signInStr, String signOutStr,PageView<Attendance> pageView);

    Attendance checkLoginIn(String id, String formatDate);

    int addSignIn(String userId, String id, String ipAddr) throws ParseException;

    int attendSignOut(Attendance attendance) throws ParseException;
}
