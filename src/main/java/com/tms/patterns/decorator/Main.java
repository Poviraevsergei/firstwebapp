package com.tms.patterns.decorator;

import com.tms.patterns.decorator.model.CppDeveloper;
import com.tms.patterns.decorator.model.JavaDeveloper;

import java.util.LinkedList;

public class Main {
    private static final String MY_AGE = "42";
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        HibernateDeveloper hibernateDeveloperJava = new HibernateDeveloper(javaDeveloper);
        SpringDeveloper springHibernateDeveloperJava = new SpringDeveloper(hibernateDeveloperJava);

        CppDeveloper cppDeveloper = new CppDeveloper();
        DatabaseDeveloper databaseDeveloperCpp = new DatabaseDeveloper(cppDeveloper);

        springHibernateDeveloperJava.printSkills();
        databaseDeveloperCpp.printSkills();

        LinkedList<String> list = new LinkedList<>();
        list.addFirst(MY_AGE);
    }
}
