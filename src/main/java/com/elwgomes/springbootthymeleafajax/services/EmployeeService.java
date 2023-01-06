package com.elwgomes.springbootthymeleafajax.services;


import com.elwgomes.springbootthymeleafajax.entities.Employee;
import com.elwgomes.springbootthymeleafajax.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAll () {
        return repository.findAll();
    }

    public Employee findById (Long id) {
        Optional<Employee> obj = repository.findById(id);
        return obj.get();
    }

    public Employee insert (Employee obj) {
        return repository.save(obj);
    }

    public Employee update (Long id, Employee obj) {
        Employee entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    public void updateData (Employee entity, Employee obj) {
        entity.setName(obj.getName());
        entity.setAge(obj.getAge());
        entity.setDepartment(obj.getDepartment());
    }

    public void delete (Long id) {
        repository.deleteById(id);
    }

}