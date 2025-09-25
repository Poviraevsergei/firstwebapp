package com.tms.patterns.factory_method.factory;

import com.tms.patterns.factory_method.model.Computer;
import com.tms.patterns.factory_method.model.Developer;
import com.tms.patterns.factory_method.model.Workplace;

public interface ITFactory {
    Computer createComputer();
    Developer createDeveloper();
    Workplace createWorkplace();
}
