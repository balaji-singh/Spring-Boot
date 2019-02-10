package com.masterjavaonline.springboot.springbootjparestdemo.repository;

import com.masterjavaonline.springboot.springbootjparestdemo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    Employee findByName(String name);
    Employee findByPhoneno(String phoneno);
    Employee findByDeskno(String deskno);
}
