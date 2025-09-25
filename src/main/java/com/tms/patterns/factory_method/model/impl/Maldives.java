package com.tms.patterns.factory_method.model.impl;

import com.tms.patterns.factory_method.model.Workplace;

public class Maldives implements Workplace {
    @Override
    public void work() {
        System.out.println("Maldives work: chill, relax :)");
    }
}
