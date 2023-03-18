package com.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpServices {
	
	@Autowired
	EmployeeRepository EmployeeRepo;

	@Override
	public Employee saveEmp(Employee employee) {
		Employee emp = EmployeeRepo.save(employee);
		return emp;
	}

	@Override
	public List<Employee> showAllemp() {
		List<Employee> findAll = EmployeeRepo.findAll();
		return findAll;
		
	}

	@Override
	public Employee showById(long id) {
		Employee employee = EmployeeRepo.findById(id).get();
		return employee;
	}

	@Override
	public void DeletById(long id) {
		EmployeeRepo.deleteById(id);
		
	}

	@Override
	public Employee updateEmp(Employee emp) {
		Employee update = EmployeeRepo.save(emp);
		return update;
	}

}
