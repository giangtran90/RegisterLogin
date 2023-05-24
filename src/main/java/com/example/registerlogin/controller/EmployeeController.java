package com.example.registerlogin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registerlogin.dto.EmployeeDTO;
import com.example.registerlogin.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/employee")
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeeService employeeService;
	
	@PostMapping(path = "/save")
	public @ResponseBody String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
		String id =  employeeService.saveEmployee(employeeDTO);
		return id;
	}
}
