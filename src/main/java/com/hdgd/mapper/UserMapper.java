package com.hdgd.mapper;

import com.hdgd.pojo.Menu;
import com.hdgd.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    //添加
    @Insert("insert into usertable values(#{userID},#{empName},#{username},#{password},#{departmentID},#{post})")
    public void addUser(User user);

    //删除
    @Delete("delete from usertable where userID = #{userID}")
    public void deleteUser(int userID);

    //修改用户信息
    @Update("update usertable set userID = #{userID}," +
            "empName =  #{empName}," +
            "username = #{username}," +
            "password = #{password}," +
            "departmentID = #{departmentID}," +
            "post = #{post} where userID = #{userID}")
    public void updateUser(User user);


    //分页查询
    @Select("select * from usertable")
    List<Map<String,Object>> queryPageUser();

    //根据ID查找用户信息
    @Select("select * from usertable where userID = #{userID}")
    public User getUserByID(Integer userID);

    //根据username查询登录信息
    @Select("select * from usertable where username = #{username}")
    public User loginByUsername(String username);

    //权限测试
    @Select("select *\n" +
            "FROM usertable\n" +
            "limit #{offset},#{limit}")
    List<User> queryAllByLimit (int offset, int limit);


}
