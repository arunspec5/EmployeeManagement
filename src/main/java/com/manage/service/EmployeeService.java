package com.manage.service;

import java.util.List;

import com.manage.model.Employee;

public interface EmployeeService {
	   void save(Employee employee);
	 
	   List<Employee> list();
	}