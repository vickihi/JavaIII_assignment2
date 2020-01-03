package serviceinjection.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import serviceinjection.model.Employee;
import serviceinjection.service.ClerkService;
import serviceinjection.service.ManagerService;

@Configuration
public class AppConfig {
	
		//adding into xml
		@Bean
		public ClerkService clerk() {
			return new ClerkService();
		}
		
		@Bean
		public ManagerService manager() {
			return new ManagerService();
		}
		
		@Bean(name="clerkEmployee")
		public Employee clerkEmployee() {
			return new Employee(clerk());
		}

		@Bean(name="managerEmployee")
		public Employee managerEmployee() {
			return new Employee(manager());
		}
}
