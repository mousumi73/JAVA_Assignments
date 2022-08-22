package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public abstract class EmployeeServiceInterface implements EmployeeService {
	
	Map<Integer,Employee> employees=new HashMap();

	@Override
	public Employee addEmployee(Employee emp) {
		employees.put(emp.getId(), emp);
		return emp;
	}

	@Override
	public void deleteEmployeeById(int empId) {
		
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		return null;
	}

	@Override
	public String viewInsurancePolicy(int empId) {
		return null;
	}

	@Override
	public double updateSalary(int empId, double salary) {
		return 0;
	}

	@Override
	public String updateEmpName(int empId, String newName) {
		return null;
	}

	
}
