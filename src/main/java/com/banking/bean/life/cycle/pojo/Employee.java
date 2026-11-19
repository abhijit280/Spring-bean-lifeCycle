package com.banking.bean.life.cycle.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {

	private String name;
	private String empId;

	public Employee(@Value("Abhijit Pradhan") String name, @Value("AB!@#$%") String empId) {
		
		super();
		System.out.println("`1.Employee.Employee()::::::::::::Constructor");
		this.name = name;
		this.empId = empId;
	}

	public String display() {
		System.out.println("4. Employee.display()::::::::::::::: work of thr bean");
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

}
