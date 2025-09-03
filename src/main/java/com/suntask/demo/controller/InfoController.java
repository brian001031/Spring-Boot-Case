package com.suntask.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class InfoController {
    // 讀取 company 配置
    @Value("${info.company.name}")
    private String companyName;

    @Value("${info.company.url}")
    private String companyUrl;

    @Value("${info.company.address}")
    private String companyAddress;

    // 讀取 author 配置
    @Value("${info.author.name}")
    private String authorName;

    @Value("${info.author.depart}")
    private String authorDepart;

    @Value("${info.project.groupid}")
    private String groupId;

    @Value("${info.project.artifactid}")
    private String artifactId;

    @GetMapping("/project")
    public Map<String, String> getProjectInfo() {
        Map<String, String> project = new HashMap<>();
        project.put("groupid", groupId);
        project.put("artifactid", artifactId);
        return project;
    }

    // GET /company
    @GetMapping("/company")
    public Map<String, String> getCompanyInfo() {
        Map<String, String> company = new HashMap<>();
        company.put("name", companyName);
        company.put("url", companyUrl);
        company.put("address", companyAddress);
        return company;
    }

    // GET /author
    @GetMapping("/author")
    public Map<String, String> getAuthorInfo() {
        Map<String, String> author = new HashMap<>();
        author.put("name", authorName);
        author.put("depart", authorDepart);
        return author;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
