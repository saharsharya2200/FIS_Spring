package com.fis.springlearn;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springlearn.bean.Department;
import com.fis.springlearn.bean.Employee;
import com.fis.springlearn.bean.Skills;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		// displayDate();
		// displayCountry();
		//displayCountries();
		displayEmployee();
	}
	
	static void displayEmployee() {
		LOGGER.info("EMPLOYEE INFORMATION STARTS");
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = context.getBean("employee", Employee.class);
		LOGGER.debug("Employee List : {}", employee);
		LOGGER.info("EMPLOYEE INFORMATION ENDS");

	}
	
	static void displayCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList countryL = context.getBean("countryList", ArrayList.class);
		LOGGER.debug("Country List : {}", countryL);

	}

	static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());

		Country country2 = context.getBean("country2", Country.class);
		LOGGER.debug("Country : {}", country2.toString());
	}

	static void displayDate() {
		LOGGER.info("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date parseDate = format.parse("2/1/2022");
			LOGGER.debug(parseDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat format1 = context.getBean("dateFormat1", SimpleDateFormat.class);
		try {
			Date parseDate1 = format1.parse("08/10/2023");
			// System.out.println(parseDate1);
			LOGGER.debug(parseDate1.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		SimpleDateFormat format2 = context.getBean("dateFormat2", SimpleDateFormat.class);
		try {
			Date parseDate2 = format2.parse("08/12/2024");
			LOGGER.debug(parseDate2.toString());
			// System.out.println(parseDate2);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		LOGGER.info("END");
	}

}