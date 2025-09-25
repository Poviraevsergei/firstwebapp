package com.tms.patterns.factory_method.model.impl;

import com.tms.patterns.factory_method.model.Computer;

public class MiddleComputer implements Computer {
    @Override
    public void printHardwareInfo() {
        System.out.println("CPU: 8 core");
    }
}
