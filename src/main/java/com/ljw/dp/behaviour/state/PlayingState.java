package com.ljw.dp.behaviour.state;

public class PlayingState extends State {
    public PlayingState(Game game) {
        super(game);
        System.out.println("Game in playing state");
    }

    @Override
    public void onWelcomeScreen() {
        System.out.println("not allowed");
    }

    @Override
    public void onPlaying() {
        System.out.println("current playing");
    }

    @Override
    public void onBreak() {
        game.changeState(new BreakState(game));
    }

    @Override
    public void onGameOver() {
        game.changeState(new GameOverState(game));
    }


}
