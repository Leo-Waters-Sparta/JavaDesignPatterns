package com.ljw.dp.behaviour.state;

public class WelcomeScreenState extends State {
    public WelcomeScreenState(Game game) {
        super(game);
        System.out.println("Game in WelcomeScreenState.");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("current state is WelcomeScreenState.");
    }

    @Override
    public void onPlaying() {
        game.changeState(new PlayingState(game));
    }

    @Override
    public void onBreak() {
        System.out.println("not allowed.");
    }

    @Override
    public void onGameOver() {
        System.out.println("not allowed.");
    }
}
