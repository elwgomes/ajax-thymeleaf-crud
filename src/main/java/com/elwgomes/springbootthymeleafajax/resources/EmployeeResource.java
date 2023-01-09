package com.elwgomes.springbootthymeleafajax.resources;

import com.elwgomes.springbootthymeleafajax.entities.Employee;
import com.elwgomes.springbootthymeleafajax.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
@CrossOrigin
public class EmployeeResource {

    @Autowired
    private EmployeeService service;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Employee>> findAll() {
        List<Employee> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/findById")
    public ResponseEntity<Employee> findById(@RequestParam Long id) {
        Employee obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Employee> insert (@RequestBody Employee obj) {
        service.insert(obj);
        return ResponseEntity.ok().body(obj);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Employee> update (@PathVariable Long id, @RequestBody Employee obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}