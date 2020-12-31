package com.hdgd.mapper;

import com.hdgd.pojo.Weekly;
import com.hdgd.pojo.WeeklyUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeeklyUserMapper {



    @Select("select * from weekly_user_view")
    public List<WeeklyUser> weeklyView();

}
