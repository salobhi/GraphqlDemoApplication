package com.test.graphql.model;

public class Employee {
    private Long id;
    private String name;
    private String designation;
    private Long projectId;

    public Employee(Long id, String name, String designation, Long projectId) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.projectId = projectId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }
}
