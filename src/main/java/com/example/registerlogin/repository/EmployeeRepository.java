package com.example.registerlogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.registerlogin.entity.Employee;

@EnableJpaRepositories
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
