package com.masterjavaonline.springboot_graphql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Employee {

    @Id
    private String empId;
    private String empName;
    private String empType;
    private String empDept;
    private String empSal;


}
