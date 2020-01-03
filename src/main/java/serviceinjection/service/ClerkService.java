package serviceinjection.service;

public class ClerkService implements EmployeeService {
	
	private static final double RATE = 1.4;
	
	public double calculateSalary() {
		return BASE_SALARY * RATE;
	}
}