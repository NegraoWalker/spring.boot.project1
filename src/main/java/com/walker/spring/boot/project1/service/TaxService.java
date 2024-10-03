package com.walker.spring.boot.project1.service;

import org.springframework.stereotype.Service;

@Service //Classe registrada como um serviço. Container de gerenciamento do framework Spring Boot vai gerenciar a mesma
public class TaxService {
    public double tax(double amount) { //tax=imposto; amount=quantia
        return amount * 0.2;
    }
}
