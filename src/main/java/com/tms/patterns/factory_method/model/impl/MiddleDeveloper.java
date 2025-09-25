package com.tms.patterns.factory_method.model.impl;

import com.tms.patterns.factory_method.model.Developer;

public class MiddleDeveloper implements Developer {
    @Override
    public void showYourSkill() {
        System.out.println("Middle Developer: I know something!");
    }
}
