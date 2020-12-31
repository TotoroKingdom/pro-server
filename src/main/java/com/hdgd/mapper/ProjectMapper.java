package com.hdgd.mapper;

import com.hdgd.pojo.Project;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectMapper {

    @Select("select * from projecttable")
    public List<Project> findAllProject();

}
