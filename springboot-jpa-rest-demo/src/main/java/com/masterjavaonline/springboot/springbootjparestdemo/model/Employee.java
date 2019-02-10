package com.masterjavaonline.springboot.springbootjparestdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @Column(name = "EMP_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="EMP_NAME")
    private String name;

    @Column(name="DESK_NUMBER")
    private String deskno;

    @Column(name="PHONE_NO")
    private String phoneno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeskno() {
        return deskno;
    }

    public void setDeskno(String deskno) {
        this.deskno = deskno;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
