package com.cg.Employee;

import java.util.Arrays;
import java.util.List;

public class Employee {
	private String id;
	private String name;
	private List<String> add;
	
	
	public Employee(String id, String name, List<String> address) {
		this.id = id;
		this.name = name;
		this.add = address;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public List<String> getAdd() {
		return add;
	}

}
