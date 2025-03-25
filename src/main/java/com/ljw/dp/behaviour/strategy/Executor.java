package com.ljw.dp.behaviour.strategy;

public class Executor {
    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    private PrintStrategy strategy;

    public Executor(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void printString(String str) {
        System.out.println(strategy.formatString(str));
    }
}
