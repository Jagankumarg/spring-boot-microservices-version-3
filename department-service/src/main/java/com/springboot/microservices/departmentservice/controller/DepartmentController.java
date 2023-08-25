package com.springboot.microservices.departmentservice.controller;


import com.springboot.microservices.departmentservice.model.Department;
import com.springboot.microservices.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger Logger= LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository repository;

    @PostMapping
    public Department add(Department department){
        Logger.info("logger add");
        return repository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll(){
        Logger.info("logger findAll");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        Logger.info("logger findById ", id);
        return repository.findById(id);
    }
}
