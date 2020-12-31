package com.hdgd.controller;


import com.hdgd.pojo.Project;
import com.hdgd.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/findAllProject")
    public List<Project> findAllProject(){
        return projectService.findAllProject();
    }

}
