package com.tyss.factorypattern.abstractfactorypattern;

public class WebDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDev();
    }
}
