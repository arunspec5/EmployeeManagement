package com.manage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.dao.EmployeeDao;
import com.manage.model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	 
	   @Autowired
	   private EmployeeDao empDao;
	 
	   @Transactional
	   public void save(Employee emp) {
	      empDao.save(emp);
	   }
	 
	   @Transactional
	   public List<Employee> list() {
	      return empDao.list();
	   }
	}