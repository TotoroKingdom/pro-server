package com.hdgd.mapper;

import com.hdgd.pojo.Menu;
import com.hdgd.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {

    //根据用户ID查询菜单列表
    @Select("SELECT DISTINCT m1.*,\n" +
            "m2.menuID as menuID2,\n" +
            "m2.url as url2,\n" +
            "m2.path as path2,\n" +
            "m2.component as component2,\n" +
            "m2.`name` as name2,\n" +
            "m2.icon as icon2,\n" +
            "m2.keepAlive as keepAlive2,\n" +
            "m2.requireAuth as requireAuth2,\n" +
            "m2.parentID as parentID2,\n" +
            "m2.enabled as enabled2\n" +
            "FROM menutable m1\n" +
            "LEFT JOIN menutable m2 on m1.menuID = m2.parentID\n" +
            "LEFT JOIN role_menutable rm on rm.menuID = m2.menuID\n" +
            "LEFT JOIN roletable r on r.roleID = rm.roleID\n" +
            "LEFT JOIN user_roletable ur on ur.roleID = r.roleID\n" +
            "LEFT JOIN usertable u on ur.userID = u.userID\n" +
            "WHERE u.userID = #{userID}\n")
    List<Menu> getMenuByUserID(Integer userID);


}
/*
@Results(id = "ResultMap",value = {
        @Result(column = "menuID",property = "menuID",id = true),
        @Result(column = "url",property = "url"),
        @Result(column = "path",property = "path"),
        @Result(column = "component",property = "component"),
        @Result(column = "name",property = "name"),
        @Result(column = "icon",property = "icon"),
        @Result(column = "keepAlive",property = "keepAlive"),
        @Result(column = "requireAuth",property = "requireAuth"),
        @Result(column = "parentID",property = "parentID"),
        @Result(column = "enabled",property = "enabled"),
})
 */
