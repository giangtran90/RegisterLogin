package com.example.registerlogin.service;

import com.example.registerlogin.dto.EmployeeDTO;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface EmployeeService {

    String saveEmployee(EmployeeDTO employeeDTO);

    Optional<UserDetails> findByUsername(String employeeId);

}
