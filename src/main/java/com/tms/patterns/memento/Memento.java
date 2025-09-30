package com.tms.patterns.memento;

public class Memento {
    private final int age;
    private final String name;

    public Memento(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
