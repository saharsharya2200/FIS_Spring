package com.fis.springjdbc.employee;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmployee {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("daoEmployee.xml");
		EmployeeDaoImplementation bean = context.getBean("employeeDao", EmployeeDaoImplementation.class);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Create the dataset for the Employee");
		Employee newEmployee = new Employee();
		newEmployee.setId(30);
		newEmployee.setName("RandomName3");
		bean.insertEmployee(newEmployee);
		newEmployee = new Employee();
		newEmployee.setId(40);
		newEmployee.setName("RandomName4");
		bean.insertEmployee(newEmployee);
		System.out.println("Updated 2 Employees");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Delete the data of an Employee");
		int id = 10;
		bean.deleteEmployee(id);
		System.out.println("++++++++++++++++++++++Deleted the Employee+++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Get Employee details based on their ID");
		id = 20;
		Employee employeeById = bean.getEmployeeById(id);
		System.out.println(employeeById);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Update The details of an Employee");
		newEmployee = new Employee();
		newEmployee.setId(30);
		newEmployee.setName("RandomNameAgain");
		bean.updateEmployee(newEmployee);
		System.out.println("===============================");
		System.out.println("Get All Products");
		System.out.println(bean.getAllEmployees());
		System.out.println("===============================");

		context.close();

	}

}
