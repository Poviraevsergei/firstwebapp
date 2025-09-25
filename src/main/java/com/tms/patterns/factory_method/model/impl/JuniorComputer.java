package com.tms.patterns.factory_method.model.impl;

import com.tms.patterns.factory_method.model.Computer;

public class JuniorComputer implements Computer {
    @Override
    public void printHardwareInfo() {
        System.out.println("CPU: 2 core");
    }
}
