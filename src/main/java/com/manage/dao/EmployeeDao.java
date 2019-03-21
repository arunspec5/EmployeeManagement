package com.manage.dao;

import java.util.List;

import com.manage.model.Employee;

public interface EmployeeDao {
	void save(Employee emp);
	   List<Employee> list();
}
