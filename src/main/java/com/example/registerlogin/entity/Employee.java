package com.example.registerlogin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "employee_id", length = 45)
    private int employeeid;
    @Column(name = "employee_name", length = 255)
    private String employeename;
    @Column(name = "employee_email", length = 255)
    private String email;
    @Column(name = "employee_password", length = 255)
    private String password;
}
