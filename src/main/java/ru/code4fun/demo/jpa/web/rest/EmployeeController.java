package ru.code4fun.demo.jpa.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.code4fun.demo.jpa.repository.EmployeeRepository;

@RestController
@RequestMapping("/")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/test")
    public ResponseEntity findAllEmployees() {
        return ResponseEntity.ok(employeeRepository.findAll());
    }
}