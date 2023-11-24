package com.app.issuetracker.service;

import com.app.issuetracker.entity.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private static List<Project> projects  = new ArrayList<>();
    public void createProject(Project project) {
        project.setId(projects.size()+1);
        projects.add(project);
    }

    public List<Project> getAllProject() {
        return projects;
    }

    public static List<Project> getProjects() {
        return projects;
    }

    public static void setProjects(List<Project> projects) {
        ProjectService.projects = projects;
    }
}
