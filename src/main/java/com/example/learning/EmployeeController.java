package com.example.learning;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/save")
    public String saveEmployee() {

        Employee emp = new Employee();
        emp.setName("Anton");

        repository.save(emp);

        return "Employee Saved";
    }
}