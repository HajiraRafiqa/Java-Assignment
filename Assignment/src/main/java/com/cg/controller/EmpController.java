package com.cg.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Employee.Employee;
import com.cg.service.EmployeeService;

@RequestMapping("/")
@RestController
public class EmpController {

	private EmployeeService empService = new EmployeeService();
	
	@PostMapping("emp")
	Map<String, Map> empList(@RequestBody HashMap data)
	{
		
		ArrayList empIds = (ArrayList) data.get("employees");
		
		ArrayList<Map> allEmpData = new ArrayList<>();
		
		for(int i=0;i<empIds.size();i++)
		{
			
			LinkedHashMap emp_dict = (LinkedHashMap) empIds.get(i);
			Object emp_id = emp_dict.get("employeeID");
			
			Employee emp_data = empService.empList(emp_id);
			
			Map<String, Object> empData = new HashMap<>();
			empData.put("employeeID", emp_data.getId());
			empData.put("employeeName", emp_data.getName());
			empData.put("employeeAddress", emp_data.getAdd());
			
			allEmpData.add(empData);
		}
		
		Map<String, ArrayList> responseData = new HashMap<>();
		responseData.put("data", allEmpData);
		
		
		Map<String, Map> responseProfile = new HashMap<>();
		responseProfile.put("employeesProfile", responseData);
		
		return responseProfile;
	}

}
