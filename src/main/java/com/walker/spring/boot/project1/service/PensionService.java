package com.walker.spring.boot.project1.service;

import org.springframework.stereotype.Service;

@Service //Classe registrada como um serviço. Container de gerenciamento do framework Spring Boot vai gerenciar a mesma
public class PensionService {
    public double discount(double amount) { //discount=desconto; amount=quantia
        return amount * 0.1;
    }
}
