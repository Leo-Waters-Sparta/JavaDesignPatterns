package com.ljw.dp.behaviour.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator("Initial State");
        Caretaker caretaker=new Caretaker();

        caretaker.saveState(originator.createMemento());

        System.out.println("Current State is: "+  originator.state);

        originator.state = "State 1";
        caretaker.saveState(originator.createMemento());
        System.out.println("Current State is: "+  originator.state);

        originator.state = "State 2";
        caretaker.saveState(originator.createMemento());
        System.out.println("Current State is: "+  originator.state);


        System.out.println("------------");

        originator.restoreMemento(caretaker.restoreState(1));
        System.out.println("Current State is: "+  originator.state);

        originator.restoreMemento(caretaker.restoreState(0));
        System.out.println("Current State is: "+  originator.state);

        originator.restoreMemento(caretaker.restoreState(2));
        System.out.println("Current State is: "+  originator.state);


    }
}
