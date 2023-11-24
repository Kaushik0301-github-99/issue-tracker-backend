package com.app.issuetracker.controller;

import com.app.issuetracker.service.IssueService;
import com.app.issuetracker.entity.Issue;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issue")
public class IssueTrackerController {

    private final  IssueService issueService;

    public IssueTrackerController(IssueService issueService){
        this.issueService = issueService;
    }
    @PostMapping("/create/{id}")
    public void createIssue(@RequestBody Issue issue,@PathVariable int id){
        issueService.createIssue(issue,id);
    }
    @GetMapping("/get-all-issue/{id}")
    public List<Issue> getAllIssues(@PathVariable int id){
        return issueService.getAllIssues(id);
    }
}
