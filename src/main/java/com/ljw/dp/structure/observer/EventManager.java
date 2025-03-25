package com.ljw.dp.structure.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EventManager {
    Map<String, ArrayList<EventListener>> listeners = new HashMap<>();

    public EventManager(String ...  operations) {

        for (String operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener listener) {
        ArrayList<EventListener> users = listeners.get(event);
        if(!users.contains(listener)) {
            users.add(listener);
        }
    }

    public void unsubscribe(String event, EventListener listener) {
        ArrayList<EventListener> users = listeners.get(event);
        users.remove(listener);
    }

    public void notify(String event, String file) {
        ArrayList<EventListener> users = listeners.get(event);
        for(EventListener listener : users) {
            listener.notify(event, file);
        }
    }
}
