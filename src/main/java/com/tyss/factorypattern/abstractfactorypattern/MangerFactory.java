package com.tyss.factorypattern.abstractfactorypattern;

public class MangerFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
