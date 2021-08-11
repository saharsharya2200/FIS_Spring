package com.fis.springjdbc.employee;

import java.util.*;

import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class EmployeeDaoImplementation extends JdbcDaoSupport implements IEmployee {

	public List<Employee> getAllEmployees() {
		String sql = "select * from employee";
		List<Employee> employees = getJdbcTemplate().query(sql, new EmployeeMapper());
		return employees;
	}

	public void insertEmployee(Employee employee) {

		String sql = "insert into employee values(?,?)";
		Object[] args = { employee.getId(), employee.getName() };
		int insRow = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Inserted: " + insRow);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		String sql = "update employee set name = ? where id = ?";
		Object[] args = { employee.getName(), employee.getId() };
		int uRows = getJdbcTemplate().update(sql,args);
		System.out.println("Rows Inserted: " + uRows);
	
	}
	
	@Override
	public void deleteEmployee(int id) {
		String sql = "delete from employee where id = ?";
		Object[] args = {id};
		int dRows = getJdbcTemplate().update(sql,args);
		System.out.println("Rows Inserted: " + dRows);
		
	}
	
	@Override
	public Employee getEmployeeById(int id) {
		String sql = "select * from employee where id=?";
		Object[] args = { id };
		Employee employeeById = getJdbcTemplate().queryForObject(sql, args, new EmployeeMapper());
		return employeeById;
	}
}
