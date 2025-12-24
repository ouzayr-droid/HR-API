package com.openclassroms.HR_API.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openclassroms.HR_API.model.Employee;

// @Repository est là pour indiquer que la classe est un bean et que son rôle
// est de communiquer avec une source de données 
@Repository
public interface EmployeeRepository extends CrudRepository <Employee, Long> {
    
}
