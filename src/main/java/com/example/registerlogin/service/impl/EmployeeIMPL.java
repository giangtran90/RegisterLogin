package com.example.registerlogin.service.impl;

import com.example.registerlogin.dto.EmployeeDTO;
import com.example.registerlogin.entity.Employee;
import com.example.registerlogin.repository.EmployeeRepository;
import com.example.registerlogin.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeIMPL implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public String saveEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO.getEmployeeid(), employeeDTO.getEmployeename(), employeeDTO.getEmail(), "");

        employeeRepository.save(employee);

        return employee.getEmployeename();
    }

    @Override
    public Optional<UserDetails> findByUsername(String employeeId) {
        return Optional.of(new User("", "", null));
    }
}
