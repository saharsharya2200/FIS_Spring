package com.fis.springlearn.bean;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.Country;

public class Department {
	private int id;
	private String name;
	private static final Logger LOGGER = LoggerFactory.getLogger(Department.class);
	
	public Department() {
		LOGGER.debug("Inside Department Constructor");
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

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	

}
