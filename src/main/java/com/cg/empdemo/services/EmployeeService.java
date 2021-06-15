package com.cg.empdemo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.empdemo.entities.Employee;
import com.cg.empdemo.repositories.EmployeeRepository;

@Transactional
@Service
public class EmployeeService implements IEmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository ;

	@Override
	public List<Employee> viewEmployees() {
		List<Employee> empList = employeeRepository.findAll();
		return empList;
	}



}