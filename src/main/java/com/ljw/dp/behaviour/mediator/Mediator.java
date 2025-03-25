package com.ljw.dp.behaviour.mediator;

import java.util.ArrayList;

public class Mediator {
    ArrayList<ChatUser> users = new ArrayList<>();

    public Mediator addUser(ChatUser user) {
        users.add(user);
        return this;
    }

    public void sendMessage(String message, ChatUser src) {
        for (ChatUser user : users) {
            if(!user.equals(src)) {
                user.receiveMessage(message);
            }
        }
    }
}
