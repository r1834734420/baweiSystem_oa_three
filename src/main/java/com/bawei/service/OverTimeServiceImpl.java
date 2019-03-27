package com.bawei.service;

import com.bawei.mapper.OvertimeMapper;
import com.bawei.pojo.Overtime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class OverTimeServiceImpl implements IOverTimeService{
    HttpServletRequest request = null;
    Integer

    @Autowired
    private OvertimeMapper overtimeMapper;

    public List<Overtime> overtimeList(String id) {


    }
}
