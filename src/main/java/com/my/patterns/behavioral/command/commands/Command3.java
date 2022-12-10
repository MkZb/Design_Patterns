package com.my.patterns.behavioral.command.commands;

import com.my.patterns.behavioral.command.Command;
import com.my.patterns.behavioral.command.Receiver;

public class Command3 implements Command {
    private final Receiver receiver;

    public Command3(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Command3#execute");
        receiver.operation("3");
    }
}
