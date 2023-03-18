package com.employee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entities.Employee;
import com.employee.services.EmpServices;

@RestController
@RequestMapping
public class EmployeeController {
	
	@Autowired
	EmpServices empservices;
	
	@PostMapping("/save")
	public ResponseEntity<Employee>addEmp(@RequestBody Employee emp){
		Employee saveEmp = empservices.saveEmp(emp);
		return new ResponseEntity<Employee>(saveEmp,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>>showEmp(@RequestBody Employee emp){
		List<Employee> showAllemp = empservices.showAllemp();
		return new ResponseEntity<List<Employee>>(showAllemp,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public  ResponseEntity<Employee>showById(@PathVariable("id") long id){
		 Employee showById = empservices.showById(id);
		return new  ResponseEntity<Employee>(showById,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> DeletById(@PathVariable("id")long id){
		empservices.DeletById(id);
	return new	ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee>updateEmp(@RequestBody Employee emp){
		Employee update = empservices.updateEmp(emp);
		return new ResponseEntity<Employee>(update,HttpStatus.ACCEPTED);
	}
	

}
