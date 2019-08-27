package com.masterjavaonline.springboot_graphql.service;

import com.masterjavaonline.springboot_graphql.model.Employee;
import com.masterjavaonline.springboot_graphql.repository.EmployeeRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AllEmployeeDataFetcher implements DataFetcher<List<Employee>>{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return employeeRepository.findAll();
    }
}
