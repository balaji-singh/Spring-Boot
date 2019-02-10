package com.masterjavaonline.springboot.springbootjparestdemo.controller;

import com.masterjavaonline.springboot.springbootjparestdemo.model.Employee;
import com.masterjavaonline.springboot.springbootjparestdemo.repository.EmployeeRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<Employee> getAllEmployees(@RequestParam(name = "name" ,required = false) String name){


        if(!StringUtils.isEmpty(name)){

            return Collections.singletonList(employeeRepository.findByName(name));

        }

        return (List<Employee>) employeeRepository.findAll();
    }

    @RequestMapping(value = "/bydeskno", method = RequestMethod.GET)
    public Employee getEmployeeByDesk(@RequestParam(name = "deskno" ,required = false) String deskno){


        if(!StringUtils.isEmpty(deskno)){

            return employeeRepository.findByDeskno(deskno);

        }


        return null;
    }


    @RequestMapping(value = "/byphoneno", method = RequestMethod.GET)
    public Employee getEmployeeByPhone(@RequestParam(name = "phoneno" ,required = false) String phoneno){


        if(!StringUtils.isEmpty(phoneno)){

            return employeeRepository.findByPhoneno(phoneno);

        }


        return null;
    }



}
