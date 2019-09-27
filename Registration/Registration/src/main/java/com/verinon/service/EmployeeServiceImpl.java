package com.verinon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verinon.dao.EmployeeDao;
import com.verinon.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee registerEmployee(Employee employee) {
		
		return dao.save(employee);
	}

}
