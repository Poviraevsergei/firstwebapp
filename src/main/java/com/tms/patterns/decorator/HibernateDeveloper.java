package com.tms.patterns.decorator;

import com.tms.patterns.decorator.model.Developer;

public class HibernateDeveloper extends DeveloperDecorator{
    public HibernateDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void printSkills() {
        super.printSkills();
        System.out.println("I can work with Hibernate!");
    }
}
