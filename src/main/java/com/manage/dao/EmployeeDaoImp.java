package com.manage.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manage.model.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {
	@Autowired
	   private SessionFactory sessionFactory;
	 
	   @Override
	   public void save(Employee emp) {
	      sessionFactory.getCurrentSession().save(emp);
	   }
	 
	   @Override
	   public List<Employee> list() {
	      @SuppressWarnings("unchecked")
	      TypedQuery<Employee> query = sessionFactory.getCurrentSession().createQuery("from Employee");
	      return query.getResultList();
	   }
}
