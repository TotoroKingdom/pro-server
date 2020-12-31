package com.hdgd.service;

import com.hdgd.pojo.Weekly;
import com.hdgd.pojo.WeeklyUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface WeeklyUserService {

    public List<WeeklyUser> weeklyView();
}
