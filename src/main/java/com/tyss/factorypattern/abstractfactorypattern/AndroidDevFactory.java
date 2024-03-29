package com.tyss.factorypattern.abstractfactorypattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }
}
