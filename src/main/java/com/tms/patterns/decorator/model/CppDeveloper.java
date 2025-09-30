package com.tms.patterns.decorator.model;

public class CppDeveloper implements Developer {
    @Override
    public void printSkills() {
        System.out.println("I know C++.");
    }
}
