package com.cg.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.cg.Employee.Employee;

public class EmployeeService {

	public Employee empList(Object emp_id) {
		
		List<String> address = Arrays.asList("ADR1", "ADR2", "ADR3");
		
		HashMap<String, Employee> employee_data = new HashMap<>();
		
		employee_data.put("EMP-101", new Employee("EMP-101", "E1", address));
		employee_data.put("EMP-102", new Employee("EMP-102", "E2", address));
		employee_data.put("EMP-103", new Employee("EMP-103", "E3", address));
		
		return employee_data.get(emp_id);
	}

}
