package com.app.issuetracker.service;

import com.app.issuetracker.entity.Issue;
import com.app.issuetracker.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IssueService {
    private  ProjectService projectService;
     public IssueService(ProjectService projectService){
        this.projectService = projectService;
    }
    public void createIssue(Issue issue, int id) {
        Optional<Project> project = ProjectService.getProjects().stream().filter(pro->pro.getId()==id).findFirst();
        List<Issue> issues = project.get().getIssues();
        issue.setId(project.get().getIssues().size()+1);
        issues.add(issue);
        project.get().setIssues(issues);
    }

    public List<Issue> getAllIssues(int id) {
        return ProjectService.getProjects().stream().filter(pro->pro.getId()==id).findFirst().get().getIssues();
    }
}
