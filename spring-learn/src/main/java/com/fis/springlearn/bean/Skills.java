package com.fis.springlearn.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Skills {
	private int id;
	private String name;
	private static final Logger LOGGER = LoggerFactory.getLogger(Skills.class);
	
	public Skills() {
		LOGGER.debug("Inside Skills Constructor");
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
		return "Skills [id=" + id + ", name=" + name + "]";
	}
	
	
}
