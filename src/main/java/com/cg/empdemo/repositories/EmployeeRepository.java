package com.cg.empdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.empdemo.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
