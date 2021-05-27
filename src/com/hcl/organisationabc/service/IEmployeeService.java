package com.hcl.organisationabc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hcl.organisationabc.modal.Employee;

public interface IEmployeeService {
	
	public List<String> sortingNames(ArrayList<Employee> employeeList);

	public Map<String, Integer> cityNameCount(ArrayList<Employee> employeeList);

	public Map<Integer, Integer> monthlySalary(ArrayList<Employee> employeeList);

}
