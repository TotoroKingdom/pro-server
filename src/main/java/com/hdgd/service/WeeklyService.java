package com.hdgd.service;

import com.hdgd.pojo.Weekly;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface WeeklyService {

    public List<Weekly> findAllWeekly();

    public void addWeekly(Weekly weekly);

}
