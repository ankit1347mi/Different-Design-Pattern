package com.tyss.factorypattern.abstractfactorypattern;

public class AndroidDev implements Employee {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        return "Android Developer";
    }
}
