package com.tms.patterns.factory_method.factory.impl;

import com.tms.patterns.factory_method.factory.ITFactory;
import com.tms.patterns.factory_method.model.Computer;
import com.tms.patterns.factory_method.model.Developer;
import com.tms.patterns.factory_method.model.Workplace;
import com.tms.patterns.factory_method.model.impl.Home;
import com.tms.patterns.factory_method.model.impl.MiddleComputer;
import com.tms.patterns.factory_method.model.impl.MiddleDeveloper;

public class MiddleITFactory implements ITFactory {

    @Override
    public Computer createComputer() {
        return new MiddleComputer();
    }

    @Override
    public Developer createDeveloper() {
        return new MiddleDeveloper();
    }

    @Override
    public Workplace createWorkplace() {
        return new Home();
    }
}
