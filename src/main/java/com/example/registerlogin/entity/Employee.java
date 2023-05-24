package com.example.registerlogin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id", length = 45)
	private int employeeid;
	@Column(name = "employee_name", length = 255)
	private String employeename;
	@Column(name = "employee_email", length = 255)
	private String email;
	@Column(name = "employee_password", length = 255)
	private String password;
}
