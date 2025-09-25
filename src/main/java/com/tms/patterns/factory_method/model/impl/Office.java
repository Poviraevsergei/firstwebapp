package com.tms.patterns.factory_method.model.impl;

import com.tms.patterns.factory_method.model.Workplace;

public class Office implements Workplace {
    @Override
    public void work() {
        System.out.println("Working in office");
    }
}
