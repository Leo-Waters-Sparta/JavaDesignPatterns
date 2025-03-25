package com.ljw.dp.observer;



public class EmailNotificationListener implements EventListener
{


    @Override
    public void notify(String eventType, String file) {
        System.out.println("email notification: " + eventType + " performed on " + file);
    }
}
