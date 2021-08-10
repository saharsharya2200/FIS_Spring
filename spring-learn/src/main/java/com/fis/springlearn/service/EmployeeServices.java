package com.fis.springlearn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fis.springlearn.Dao.EmployeeDao;

@Component
public class EmployeeServices {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServices.class);

	private EmployeeDao employeeDao;

	public EmployeeServices() {
		LOGGER.debug("Inside Employee Service Constructor");
	}

	@Autowired
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
}

