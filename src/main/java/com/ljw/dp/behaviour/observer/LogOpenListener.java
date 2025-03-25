package com.ljw.dp.behaviour.observer;



public class LogOpenListener implements EventListener
{


    @Override
    public void notify(String eventType, String file) {
        System.out.println("log Open Listener: " + eventType + " performed on " + file);
    }
}
