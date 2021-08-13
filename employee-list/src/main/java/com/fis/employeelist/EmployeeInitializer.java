package com.fis.employeelist;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class EmployeeInitializer implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    EmployeeInitializer(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Employee1", "Employee2", "Employee3", "Employee4")
                .forEach(employee -> employeeRepository.save(new Employee(employee)));

        employeeRepository.findAll().forEach(System.out::println);

}
}
