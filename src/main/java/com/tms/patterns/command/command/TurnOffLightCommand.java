package com.tms.patterns.command.command;

import com.tms.patterns.command.model.Light;

public class TurnOffLightCommand implements Command{
    private Light light;

    public TurnOffLightCommand(){
        light = new Light();
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
