package com.mvcdemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcdemo.Dao.EmployeeDao;
import com.mvcdemo.Entity.Employee;
@Service
public class EmployeeServices {

	@Autowired
	private EmployeeDao employeeDao;

	public void seteEployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public Employee getEmployeeById(Integer id) {
		Employee employee = employeeDao.getEmployeeById(id);
		return employee;
	}
}
