package com.cg.empdemo.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.empdemo.entities.Employee;
@Service
public interface IEmployeeService {
	public List<Employee> viewEmployees();

}