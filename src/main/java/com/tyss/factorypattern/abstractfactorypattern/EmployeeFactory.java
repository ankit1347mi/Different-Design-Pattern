package com.tyss.factorypattern.abstractfactorypattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }
}
