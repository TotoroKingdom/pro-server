package com.hdgd.mapper;

import com.hdgd.pojo.Permission;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionMapper {

    @Select("select p.*\n" +
            "from usertable u\n" +
            "LEFT JOIN user_roletable ur on u.userID = ur.userID\n" +
            "LEFT JOIN roletable r on r.roleID = ur.roleID\n" +
            "LEFT JOIN role_permission rp on rp.roleID = r.roleID\n" +
            "left JOIN permissiontable p on p.permissionID = rp.permissionID\n" +
            "WHERE u.userID=#{userID}")
    List<Permission> getPermissionByUserID(int userID);

    //查询具体某个接口的权限
    @Select("select pe.*\n" +
            "from permissiontable pe\n" +
            "LEFT JOIN permission_path pp ON pp.permissionID = pe.permissionID\n" +
            "LEFT JOIN pathtable pa ON pa.pathID = pp.pathID\n" +
            "WHERE pa.url = #{path}")
    List<Permission> selectListByPath(String path);

    //获取权限列表
    @Select("select *\n" +
            "from permissiontable")
    List<Permission> selectAllPermission();
}
