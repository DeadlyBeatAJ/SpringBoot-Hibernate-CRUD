package com.Deadlybeat.service;

import java.util.List;

import com.Deadlybeat.model.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
