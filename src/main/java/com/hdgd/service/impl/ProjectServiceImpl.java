package com.hdgd.service.impl;

import com.hdgd.mapper.ProjectMapper;
import com.hdgd.pojo.Project;
import com.hdgd.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> findAllProject(){
        return projectMapper.findAllProject();
    }
}
