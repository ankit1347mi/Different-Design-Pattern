package com.tyss.factorypattern.abstractfactorypattern;

public class WebDev implements Employee {
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        return "I am a Web Developer";
    }
}
