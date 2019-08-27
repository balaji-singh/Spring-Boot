package com.masterjavaonline.springboot_graphql.service;

import com.masterjavaonline.springboot_graphql.model.Employee;
import com.masterjavaonline.springboot_graphql.repository.EmployeeRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmployeeDataFetcher implements DataFetcher<Optional<Employee>> {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Optional<Employee> get(DataFetchingEnvironment dataFetchingEnvironment) {


        return employeeRepository.findOne(dataFetchingEnvironment.getArgument("id"));
    }
}
