package com.ljw.dp.structure.observer;



public class LogOpenListener implements EventListener
{


    @Override
    public void notify(String eventType, String file) {
        System.out.println("log Open Listener: " + eventType + " performed on " + file);
    }
}
