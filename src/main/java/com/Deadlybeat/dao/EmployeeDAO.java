package com.Deadlybeat.dao;

import java.util.List;

import com.Deadlybeat.model.Employee;

public interface EmployeeDAO {

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	
}
