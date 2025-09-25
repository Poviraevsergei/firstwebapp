package com.tms.patterns.factory_method.model.impl;

import com.tms.patterns.factory_method.model.Developer;

public class SeniorDeveloper implements Developer {
    @Override
    public void showYourSkill() {
        System.out.println("Senior Developer: I'm a god!");
    }
}
