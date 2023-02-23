package com.test.graphql.service;

import com.test.graphql.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private static List<Employee> employees = null;

    @PostConstruct
    private void init() {
        employees = Arrays.asList(new Employee(1L, "Ahmed", "Designer", 1L),
                new Employee(2L, "Muhammad", "Software Engineer", 2L),
                new Employee(3L, "Wali", "Business Analyst", 3L),
                new Employee(4L, "Khan", "Project Manager", 4L));
    }

    public Employee getEmployeeById(Long employeeId) {
        return employees.stream().filter(employee -> employee.getId().equals(employeeId)).findFirst().orElse(null);
    }


}
