package com.ljw.dp.behaviour.observer;



public class EmailNotificationListener implements EventListener
{


    @Override
    public void notify(String eventType, String file) {
        System.out.println("email notification: " + eventType + " performed on " + file);
    }
}
