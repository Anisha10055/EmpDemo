package com.cg.empdemo.services;
import java.util.List;

import com.cg.empdemo.entities.Employee;

public interface IEmployeeService {
	List<Employee> findAll();

}