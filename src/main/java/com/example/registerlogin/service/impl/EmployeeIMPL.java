package com.example.registerlogin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.registerlogin.dto.EmployeeDTO;
import com.example.registerlogin.entity.Employee;
import com.example.registerlogin.repository.EmployeeRepository;
import com.example.registerlogin.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeIMPL implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String saveEmployee(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(employeeDTO.getEmployeeid(), employeeDTO.getEmployeename(),
				employeeDTO.getEmail(), this.passwordEncoder.encode(employeeDTO.getPassword()));
		employeeRepository.save(employee);
		return employee.getEmployeename();
	}

}
