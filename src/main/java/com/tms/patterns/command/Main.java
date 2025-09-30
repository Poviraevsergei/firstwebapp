package com.tms.patterns.command;

import com.tms.patterns.command.command.TurnOffComputer;
import com.tms.patterns.command.command.TurnOffLightCommand;
import com.tms.patterns.command.command.TurnOnComputer;
import com.tms.patterns.command.command.TurnOnLightCommand;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new TurnOnComputer());
        remoteControl.setCommand(new TurnOnLightCommand());
        remoteControl.setCommand(new TurnOffComputer());
        remoteControl.setCommand(new TurnOffLightCommand());

        System.out.println("Wakeup!");
        remoteControl.action();
        remoteControl.action();

        remoteControl.removeNextCommand();
        System.out.println("Go sleep!");
        remoteControl.action();
    }
}
