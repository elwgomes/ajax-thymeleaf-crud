package com.elwgomes.springbootthymeleafajax.repositories;

import com.elwgomes.springbootthymeleafajax.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
