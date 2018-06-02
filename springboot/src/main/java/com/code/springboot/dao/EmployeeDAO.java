package com.code.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.springboot.model.Employee;
import com.code.springboot.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//save
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	
	//search
	public List<Employee> findALL(){
		return employeeRepository.findAll();
	}
	
	//update
	
	public Employee findOne(Long empid) {
		return employeeRepository.getOne(empid);
	}
	
	
	//Delete
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
		
	}

}
