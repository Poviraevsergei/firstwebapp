package com.tms.patterns.factory_method.factory.impl;

import com.tms.patterns.factory_method.factory.ITFactory;
import com.tms.patterns.factory_method.model.Computer;
import com.tms.patterns.factory_method.model.Developer;
import com.tms.patterns.factory_method.model.Workplace;
import com.tms.patterns.factory_method.model.impl.JuniorComputer;
import com.tms.patterns.factory_method.model.impl.JuniorDeveloper;
import com.tms.patterns.factory_method.model.impl.Office;

public class JuniorITFactory implements ITFactory {
    @Override
    public Computer createComputer() {
        return new JuniorComputer();
    }

    @Override
    public Developer createDeveloper() {
        return new JuniorDeveloper();
    }

    @Override
    public Workplace createWorkplace() {
        return new Office();
    }
}
