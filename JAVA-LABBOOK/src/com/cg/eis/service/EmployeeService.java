package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee emp);
	void deleteEmployeeById(int empId);
	Employee updateEmployee(int empId, Employee emp);
	
	String viewInsurancePolicy(int empId);
	double updateSalary(int empId, double salary);
	String updateEmpName(int empId, String newName);
}
