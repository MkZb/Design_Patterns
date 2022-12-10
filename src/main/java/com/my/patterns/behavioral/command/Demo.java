package com.my.patterns.behavioral.command;

import com.my.patterns.behavioral.command.commands.Command1;
import com.my.patterns.behavioral.command.commands.Command2;
import com.my.patterns.behavioral.command.commands.Command3;

public class Demo {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command1 = new Command1(receiver);
        Command command2 = new Command2(receiver);
        Command command3 = new Command3(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command1);
        invoker.executeCommand();
        invoker.setCommand(command2);
        invoker.executeCommand();
        invoker.setCommand(command3);
        invoker.executeCommand();

    }
}
