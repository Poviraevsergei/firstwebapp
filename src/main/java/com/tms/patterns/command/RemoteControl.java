package com.tms.patterns.command;

import com.tms.patterns.command.command.Command;

import java.util.ArrayDeque;
import java.util.Stack;

public class RemoteControl {
    private ArrayDeque<Command> history = new ArrayDeque<>();

    public void setCommand(Command command) {
        history.addFirst(command);
    }

    public void action() {
        history.removeLast().execute();
    }

    public void removeNextCommand(){
        history.removeLast();
    }
}
