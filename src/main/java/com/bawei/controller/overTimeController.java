package com.bawei.controller;

import com.bawei.pojo.Overtime;
import com.bawei.service.IOverTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class overTimeController {

    @Autowired
    private IOverTimeService overTimeService;

    @RequestMapping("/overtime/list")
    public List<Overtime> overtimeList(String id){
        return this.overTimeService.overtimeList(id);
    }
}
