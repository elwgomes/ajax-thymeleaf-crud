package com.elwgomes.springbootthymeleafajax.config;

import com.elwgomes.springbootthymeleafajax.entities.Employee;
import com.elwgomes.springbootthymeleafajax.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile(value = "test")
public class Instantiation implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void run(String... args) throws Exception {

        Employee e1 = new Employee(null, "Leonardo", 21,"Tecnologia da Informação");
        Employee e2 = new Employee(null, "Elyssana", 23 , "Gerente");

        employeeRepository.saveAll(Arrays.asList(e1, e2));

    }
}
