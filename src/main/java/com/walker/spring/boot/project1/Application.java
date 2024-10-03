package com.walker.spring.boot.project1;

import com.walker.spring.boot.project1.entity.Employee;
import com.walker.spring.boot.project1.service.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private final SalaryService salaryService;

	public Application(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Salário do empregado líquido: " + salaryService.netSalary(new Employee("Walker", 4000.00)));
	}
}
