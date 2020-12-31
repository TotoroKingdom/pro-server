package com.hdgd.mapper;

import com.hdgd.pojo.Weekly;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeeklyMapper {

    @Select("select * from weeklytable")
    public List<Weekly> findAllWeekly();

    @Insert("insert into weeklytable values(#{weeklyID},#{userID},#{weeklyContent},#{startTime},#{endTime})")
    public void addWeekly(Weekly weekly);

}
