package com.tms.patterns.command.command;

import com.tms.patterns.command.model.Computer;

public class TurnOffComputer implements Command {
    private Computer computer;

    public TurnOffComputer(){
        computer = new Computer();
    }

    @Override
    public void execute() {
        computer.turnOff();
    }
}
