package com.tms.patterns.factory_method.model.impl;

import com.tms.patterns.factory_method.model.Computer;

public class SeniorComputer implements Computer {
    @Override
    public void printHardwareInfo() {
        System.out.println("CPU: 22 core");
    }
}
