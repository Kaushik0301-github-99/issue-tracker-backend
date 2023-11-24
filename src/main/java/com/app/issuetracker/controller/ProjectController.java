package com.app.issuetracker.controller;

import com.app.issuetracker.service.ProjectService;
import com.app.issuetracker.entity.Project;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin("*")
@RequestMapping("/project")
public class ProjectController {

  private final  ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @PostMapping("/create")
    public void createProject(@RequestBody Project project){
    projectService.createProject(project);
    }
    @GetMapping("/get-all-project")
    public List<Project> getAllProject(){
        return projectService.getAllProject();
    }

}
