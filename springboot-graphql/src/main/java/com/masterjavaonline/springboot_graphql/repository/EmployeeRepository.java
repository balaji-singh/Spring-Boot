package com.masterjavaonline.springboot_graphql.repository;

import com.masterjavaonline.springboot_graphql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
