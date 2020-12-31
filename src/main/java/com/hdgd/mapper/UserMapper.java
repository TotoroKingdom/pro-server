package com.hdgd.mapper;

import com.hdgd.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    @Insert("insert into usertable values(#{userID},#{empName},#{username},#{password},#{department},#{post})")
    public void addUser(User user);

    @Delete("delete from usertable where userID = #{userID}")
    public void deleteUser(int userID);

    @Select("select * from usertable")
    public List<User> findAllUser();

    @Select("select * from usertable")
    public List<Map<String,Object>> queryPageUser();

    @Select("select * from usertable where userID = #{userID}")
    public User getUserByID(int userID);


    @Update("update usertable set userID = #{userID}," +
            "empName =  #{empName}," +
            "username = #{username}," +
            "password = #{password}," +
            "department = #{department}," +
            "post = #{post} where userID = #{userID}")
    public void updateUser(User user);




}
