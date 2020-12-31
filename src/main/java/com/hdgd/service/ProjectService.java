package com.hdgd.service;

import com.hdgd.pojo.Project;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProjectService {

    public List<Project> findAllProject();
}
