package com.test.graphql.service;

import com.test.graphql.model.Project;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProjectService {

    private static List<Project> projects = null;

    @PostConstruct
    private void init() {
        projects = Arrays.asList(new Project(1L, "Automation", "PR-001"), new Project(2L, "ChatGPT Implementation", "PR-002"), new Project(3L, "Order Management", "PR-003"), new Project(4L, "Spend Management", "PR-004"));
    }

    public Project getProjectById(Long id) {
        return projects.stream().filter(project -> project.getId().equals(id)).findFirst().orElse(null);
    }

}
