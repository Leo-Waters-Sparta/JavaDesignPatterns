package com.ljw.dp.behaviour.command;

import java.util.ArrayList;
import java.util.List;

public class CommandProcessor {
    List<Command> commands= new ArrayList<Command>();

    public CommandProcessor addCommand(Command command) {
        commands.add(command);
        return this;
    }
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
