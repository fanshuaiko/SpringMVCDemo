package com.mvcdemo.Dao;

import org.springframework.stereotype.Repository;

import com.mvcdemo.Entity.Employee;
@Repository
public class EmployeeDao {
	public Employee getEmployeeById(Integer id) {
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName("张三");
		employee.setAddress("北京");
		
		return employee;
	}
}
