package com.ljw.dp.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        List<ChatUser> users = new ArrayList<ChatUser>();

        for(String user : List.of("Alice", "bob","peter","karen")) {
            var userInstance=new ChatUser(user,mediator);
            users.add(userInstance);
            mediator.addUser(userInstance);
        }

        users.getFirst().sendMessage("Hello Everyone");
    }
}
