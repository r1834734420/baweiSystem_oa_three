package com.bawei.service;

import com.bawei.pojo.Overtime;

import java.util.List;

public interface IOverTimeService {
    List<Overtime> overtimeList(String id);
}
