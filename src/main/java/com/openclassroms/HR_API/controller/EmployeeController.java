package com.openclassroms.HR_API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openclassroms.HR_API.model.Employee;
import com.openclassroms.HR_API.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /**
     *Read - Get all employees
     *@return - An iterable object of employee full filled 
    */
   @GetMapping("/employees")
   public Iterable<Employee> getEmployees() {
       return employeeService.getEmployees();
   }
   
}
