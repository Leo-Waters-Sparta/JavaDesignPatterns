package com.ljw.dp.behaviour.command;

public class OrderExecuteCommand implements Command {

    int id;

    public OrderExecuteCommand(int id) {
        this.id = id;
    }

    @Override
    public void execute() {
        System.out.println("Executing Order Command on Order #" + id);
    }
}
