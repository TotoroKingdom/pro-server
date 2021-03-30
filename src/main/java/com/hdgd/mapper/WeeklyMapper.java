package com.hdgd.mapper;

import com.hdgd.pojo.Weekly;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface WeeklyMapper {

    //添加周报
    @Insert("insert into weeklytable values(#{weeklyID},#{userID},#{weeklyContent},#{startTime},#{endTime})")
    public void addWeekly(Weekly weekly);

    //删除周报
    @Delete("delete from weeklytable where weeklyID=#{weeklyID}")
    public void deleteWeekly(int weeklyID);

    //修改周报
    @Update("update weeklytable set weeklyID = #{weeklyID}, " +
            "userID = #{userID}, " +
            "weeklyContent = #{weeklyContent}, " +
            "startTime = #{startTime}, " +
            "endTime = #{endTime} where weeklyID = #{weeklyID}")
    public void updateWeekly(Weekly weekly);


    //分页查询所有周报
    @Select("select weeklyID,weeklyContent,empName,startTime,endTime\n" +
            "from weeklytable w LEFT OUTER JOIN usertable u \n" +
            "on w.userID=u.userID \n" +
            "GROUP BY endTime DESC, weeklyID DESC")
    public List<Map<String,Object>> queryPageWeekly();


    //分页查询声学部周报
    @Select("select weeklyID,weeklyContent,empName,startTime,endTime\n" +
            "from weeklytable w LEFT OUTER JOIN usertable u \n" +
            "on w.userID=u.userID where u.departmentID = 1 \n" +
            "GROUP BY endTime DESC, weeklyID DESC")
    public List<Map<String,Object>> queryAcousticsWeekly();

    //分页查询显控部周报
    @Select("select weeklyID,weeklyContent,empName,startTime,endTime\n" +
            "from weeklytable w LEFT OUTER JOIN usertable u \n" +
            "on w.userID=u.userID where u.departmentID = 3 \n" +
            "GROUP BY endTime DESC, weeklyID DESC")
    public List<Map<String,Object>> queryDisplayControlWeekly();

    //分页查询图像部周报
    @Select("select weeklyID,weeklyContent,empName,startTime,endTime\n" +
            "from weeklytable w LEFT OUTER JOIN usertable u \n" +
            "on w.userID=u.userID where u.departmentID = 2 \n" +
            "GROUP BY endTime DESC, weeklyID DESC")
    public List<Map<String,Object>> queryImageWeekly();

    //根据用户ID分页查询周报
    @Select("select weeklyID,weeklyContent,empName,startTime,endTime\n" +
            "from weeklytable w LEFT OUTER JOIN usertable u \n" +
            "on w.userID=u.userID WHERE empName=(\n" +
            "select empName\n" +
            "from usertable\n" +
            "where userID = #{userID}\n" +
            ")\n" +
            "GROUP BY endTime DESC, weeklyID DESC")
    public List<Map<String,Object>> getPageWeeklyByUserID(int userID);

    //根据用户名查询周报
    @Select("select weeklyContent,empName,startTime,endTime\n" +
            "from weeklytable w LEFT OUTER JOIN usertable u \n" +
            "on w.userID=u.userID WHERE empName=(\n" +
            "select empName\n" +
            "from usertable\n" +
            "where username = #{username} \n" +
            ")")
    public List<Map<String,Object>> getPageWeeklyByUsername(String username);

    //根据用户ID查询周报
    @Select("select * from weeklytable where userID=#{userID}")
    List<Weekly> getWeeklyByUserID(int UserID);

    //根据周报ID查周报
    @Select("select * from weeklytable where weeklyID=#{weeklyID}")
    public Weekly getWeeklyByWeeklyID(int weeklyID);

}
