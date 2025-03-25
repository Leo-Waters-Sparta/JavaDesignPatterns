package com.ljw.dp.behaviour.command;

public class Client
{
    public static void main(String[] args) {
        CommandProcessor processor = new CommandProcessor();
        processor.addCommand(new OrderAddCommand(1,12.33))
                .addCommand(new OrderAddCommand(2,15.33))
                .addCommand(new OrderExecuteCommand(2))
                .addCommand(new OrderExecuteCommand(1))
                .execute();
    }
}
