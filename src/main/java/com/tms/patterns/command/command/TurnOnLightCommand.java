package com.tms.patterns.command.command;

import com.tms.patterns.command.model.Light;

public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(){
        light = new Light();
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
