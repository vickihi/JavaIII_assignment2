package serviceinjection.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import serviceinjection.config.AppConfig;
import serviceinjection.model.Employee;
import serviceinjection.service.ClerkService;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = 
		new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee bean = (Employee) context.getBean("clerkEmployee");
		bean.showEmployeeMessage();
		
		Employee bean1 = (Employee) context.getBean("managerEmployee");
		bean1.showEmployeeMessage();
		
	}
}
