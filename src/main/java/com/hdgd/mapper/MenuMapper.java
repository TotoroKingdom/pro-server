package com.hdgd.mapper;

import com.hdgd.pojo.Menu;
import com.hdgd.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {

    @Select("select * from menutable where id = #{id}")
    public Menu getMenuById(int id);

    @Select("select * from menutable where parentId = #{id}")
    public List<Menu> getMenuByParentId(int id);

}
