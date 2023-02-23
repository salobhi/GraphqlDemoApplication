package com.test.graphql.controller;

import com.test.graphql.model.Employee;
import com.test.graphql.model.Project;
import com.test.graphql.service.EmployeeService;
import com.test.graphql.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @QueryMapping
    public Employee employeeById(@Argument Long id) {
        return employeeService.getEmployeeById(id);
    }

    @SchemaMapping
    public Project project(Employee employee) {
        return projectService.getProjectById(employee.getProjectId());
    }
}
