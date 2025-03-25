package com.ljw.dp.behaviour.state;

public class Game {
    public State state = new WelcomeScreenState(this);

    public void changeState(State newState) {
        this.state = newState;
    }
}
