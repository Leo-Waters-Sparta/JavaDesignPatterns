package com.ljw.dp.behaviour.state;

public class BreakState extends State {
    public BreakState(Game game) {
        super(game);
        System.out.println("Game is in break state");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("not allowed");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("currently in break state");
    }

    @Override
    public void onGameOver() {
        System.out.println("not allowed");
    }
}
