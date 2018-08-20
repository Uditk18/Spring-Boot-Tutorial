package com.cg.rest.dao;

import java.util.List;

import com.cg.rest.pojo.Employee;

public interface EmployeeDao {

	

	List<Employee> viewAllEmployees();


	void addNewEmployee(Employee employee);
	void deleteEmployee(String id);
	void updateEmployee(Employee employee, String id);

}