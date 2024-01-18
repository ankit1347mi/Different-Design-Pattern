package com.tyss.factorypattern;

import com.tyss.factorypattern.abstractfactorypattern.AndroidDevFactory;
import com.tyss.factorypattern.abstractfactorypattern.Employee;
import com.tyss.factorypattern.abstractfactorypattern.EmployeeFactory;
import com.tyss.factorypattern.abstractfactorypattern.MangerFactory;
import com.tyss.factorypattern.abstractfactorypattern.WebDevFactory;
import com.tyss.factorypattern.builderpattern.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternApplication {


    public static void main(String[] args) {
        SpringApplication.run(FactoryPatternApplication.class, args);
        //Adbstract

        Employee employee = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println("Employee Name is: "+employee.name());
        System.out.println("Employee Salary is: "+employee.salary());



    }

}
