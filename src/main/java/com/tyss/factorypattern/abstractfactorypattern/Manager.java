package com.tyss.factorypattern.abstractfactorypattern;

public class Manager implements Employee {
    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        return "Manager";
    }
}
