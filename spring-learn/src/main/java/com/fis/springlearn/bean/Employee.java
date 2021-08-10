package com.fis.springlearn.bean;

import java.util.Arrays;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.Country;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private boolean permanent;
	private Date dateofbirth = new Date();
	private Department department;
	private Skills[] skills;
	
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	
	public Employee() {
		LOGGER.debug("Inside Employee Constructor");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	
	public Skills[] getSkills() {
		return skills;
	}

	public void setSkills(Skills[] skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateofbirth=" + dateofbirth + ", department=" + department + ", skills=" + Arrays.toString(skills)
				+ "]";
	}
	
}
