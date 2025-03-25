package com.ljw.dp.behaviour.observer;

public class Editor {
    public EventManager events= new EventManager("open","save");

    String file;

    void openFile(String file) {
        this.file = file;
        events.notify("open",file);
    }

    void saveFile(String file) {
        this.file = file;
        events.notify("save",file);
    }
}
