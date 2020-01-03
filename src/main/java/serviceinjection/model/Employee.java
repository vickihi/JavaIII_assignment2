package serviceinjection.model;

import org.springframework.beans.factory.annotation.Autowired;

import serviceinjection.service.EmployeeService;

public class Employee {
	
	EmployeeService service;
	
	@Autowired
	public Employee(EmployeeService service) {
		super();
		this.service = service;
	}

	public void showEmployeeMessage() {
		double salary = service.calculateSalary();
		System.out.println("The salary is " + salary);
	}
}
