package com.fis.springjpa.employee;

import org.springframework.data.repository.CrudRepository;



public interface EmployeeRepo extends CrudRepository<Employee, Integer>  {

}
