package com.ljw.dp.behaviour.memento;

import java.util.ArrayList;

public class Caretaker {
    ArrayList<Memento> MementoList = new ArrayList<Memento>();

    public void saveState(Memento memento) {
        MementoList.add(memento);
    }

    public Memento restoreState(int index) {
        return MementoList.get(index);
    }
}
