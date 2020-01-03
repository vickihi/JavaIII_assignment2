package serviceinjection.service;

public interface EmployeeService {
    /**
     * base salary
     */
	static final double BASE_SALARY = 10000.00;
	
	/**
	 * to calculate the salary
	 * @return double
	 */
	double calculateSalary();
}
