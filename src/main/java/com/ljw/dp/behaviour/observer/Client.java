package com.ljw.dp.behaviour.observer;

public class Client {

    public static void main(String[] args) {
        Editor editor = new Editor();

        EmailNotificationListener emailListener = new EmailNotificationListener();
        LogOpenListener logOpenListener = new LogOpenListener();

        editor.events.subscribe("open", emailListener);
        editor.events.subscribe("save", emailListener);

        editor.events.subscribe("open", logOpenListener);


        editor.openFile("test.txt");

        editor.events.unsubscribe("save", emailListener);

        editor.saveFile("test.txt");

    }
}
