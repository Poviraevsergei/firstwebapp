package com.tms.patterns.factory_method.model.impl;

import com.tms.patterns.factory_method.model.Developer;

public class JuniorDeveloper implements Developer {
    @Override
    public void showYourSkill() {
        System.out.println("Junior: pffff");
    }
}
