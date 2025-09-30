package com.tms.patterns.decorator.model;

public class JavaDeveloper implements Developer {

    @Override
    public void printSkills() {
        System.out.println("I can write Java code");
    }
}
