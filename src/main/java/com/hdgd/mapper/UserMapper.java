package com.hdgd.mapper;

import com.hdgd.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from usertable")
    public List<User> findAllUser();

}
