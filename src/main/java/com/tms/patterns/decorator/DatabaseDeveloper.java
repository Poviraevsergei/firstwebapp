package com.tms.patterns.decorator;

import com.tms.patterns.decorator.model.Developer;

public class DatabaseDeveloper extends DeveloperDecorator {
    public DatabaseDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void printSkills() {
        super.printSkills();
        System.out.println("I can work with SQL databases!");
    }
}
