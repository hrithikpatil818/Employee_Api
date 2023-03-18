package com.employee.services;

import java.util.List;

import com.employee.entities.Employee;

public interface EmpServices {
	
	public Employee saveEmp(Employee employee);

	public List<Employee> showAllemp();

	public Employee showById(long id);

	public void DeletById(long id);

	public Employee updateEmp(Employee emp);

}
