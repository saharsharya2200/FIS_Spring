package com.fis.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
	}
	
	static void displayDate()  {
		 ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		 SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		 try {
			Date parseDate = format.parse("2/1/2022");
			System.out.println(parseDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
		 SimpleDateFormat format1 = context.getBean("dateFormat1", SimpleDateFormat.class);
		 try {
			Date parseDate1 = format1.parse("08/10/2023");
			System.out.println(parseDate1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 
		 SimpleDateFormat format2 = context.getBean("dateFormat2", SimpleDateFormat.class);
		 try {
			Date parseDate2 = format2.parse("08/12/2024");
			System.out.println(parseDate2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}