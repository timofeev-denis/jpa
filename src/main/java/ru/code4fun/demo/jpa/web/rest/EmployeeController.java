package ru.code4fun.demo.jpa.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.code4fun.demo.jpa.domain.Employee;
import ru.code4fun.demo.jpa.repository.EmployeeRepository;

@RestController
@RequestMapping("/test")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/")
    public ResponseEntity findAllEmployees() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @PostMapping("/")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeRepository.save(employee));
    }
}
