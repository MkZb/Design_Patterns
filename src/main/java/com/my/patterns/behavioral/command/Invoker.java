package com.my.patterns.behavioral.command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        System.out.println("Invoker#executeCommand");
        command.execute();
    }
}
