package com.tms.patterns.decorator;

import com.tms.patterns.decorator.model.Developer;

public class DeveloperDecorator implements Developer {
    private final Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void printSkills() {
        developer.printSkills();
    }
}
