package com.tms.patterns.factory_method.factory.impl;

import com.tms.patterns.factory_method.factory.ITFactory;
import com.tms.patterns.factory_method.model.Computer;
import com.tms.patterns.factory_method.model.Developer;
import com.tms.patterns.factory_method.model.Workplace;
import com.tms.patterns.factory_method.model.impl.Maldives;
import com.tms.patterns.factory_method.model.impl.SeniorComputer;
import com.tms.patterns.factory_method.model.impl.SeniorDeveloper;

public class SeniorITFactory implements ITFactory {
    @Override
    public Computer createComputer() {
        return new SeniorComputer();
    }

    @Override
    public Developer createDeveloper() {
        return new SeniorDeveloper();
    }

    @Override
    public Workplace createWorkplace() {
        return new Maldives();
    }
}
