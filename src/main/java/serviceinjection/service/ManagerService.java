package serviceinjection.service;

public class ManagerService implements EmployeeService {
	
	private static final double RATE = 2.5;

	public double calculateSalary() {
		return BASE_SALARY * RATE;
	}
}
