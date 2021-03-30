package com.hdgd.mapper;

import com.hdgd.pojo.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {


    @Select("select r.*\n" +
            "from usertable u\n" +
            "LEFT JOIN user_roletable ur on u.userID = ur.userID\n" +
            "LEFT JOIN roletable r on r.roleID = ur.roleID\n" +
            "WHERE u.userID=#{userID}")
    public List<Role> getRoleByUserID(int userID);


}
