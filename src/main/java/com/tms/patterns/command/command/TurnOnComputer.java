package com.tms.patterns.command.command;

import com.tms.patterns.command.model.Computer;

public class TurnOnComputer implements Command {
    private Computer computer;

    public TurnOnComputer() {
        computer = new Computer();
    }

    @Override
    public void execute() {
        computer.turnOn();
    }
}
