package com.ljw.dp.behaviour.state;

public class GameOverState extends State {
    public GameOverState(Game game) {
        super(game);
        System.out.println("game is over");
    }

    @Override
    public void onWelcomeScreen() {
        game.changeState(new WelcomeScreenState(game));
    }

    @Override
    public void onPlaying() {
        System.out.println("not allowed");
    }

    @Override
    public void onBreak() {
        System.out.println("not allowed");
    }

    @Override
    public void onGameOver() {
        System.out.println("Currently on game over");
    }
}
