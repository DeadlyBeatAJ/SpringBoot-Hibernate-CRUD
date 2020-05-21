package com.Deadlybeat.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Deadlybeat.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Employee> query= currentSession.createQuery("from Employee",Employee.class);
		List<Employee> list= query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap(Session.class);
		Employee employee=currentSession.get(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap(Session.class);
		//currentSession.save(employee);
		//if id is null it will save as a new record and if ID is other than that then it will update as ID is auto-generated
		
		currentSession.saveOrUpdate(employee);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap(Session.class);
		Employee employee=currentSession.get(Employee.class, id);
		currentSession.delete(employee);
	}

}
