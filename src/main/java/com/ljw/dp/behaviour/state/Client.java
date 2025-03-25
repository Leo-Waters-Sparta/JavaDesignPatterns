package com.ljw.dp.behaviour.state;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        do {
            System.out.println("Please input command: ");
            try {
                input=reader.readLine().trim().toLowerCase();

                switch (input) {
                    case "w": game.state.onWelcomeScreen();
                        break;
                    case "p": game.state.onPlaying();
                        break;
                    case "b": game.state.onBreak();
                        break;
                    case "e": game.state.onGameOver();
                        break;
                    default:
                        System.out.println("Invalid command");
                        break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (!input.equals("exit"));

    }
}
