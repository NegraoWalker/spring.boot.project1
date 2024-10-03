package com.walker.spring.boot.project1.service;

import com.walker.spring.boot.project1.entity.Employee;
import org.springframework.stereotype.Service;

@Service //Classe registrada como um serviço. Container de gerenciamento do framework Spring Boot vai gerenciar a mesma.
public class SalaryService {
    private final TaxService taxService;
    private final PensionService pensionService;


    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {  //netSalary=salarioLiquido
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }
}
