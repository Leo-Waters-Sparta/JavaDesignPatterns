package com.ljw.dp.behaviour.strategy;

public class lowercaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String str) {
        return str.toLowerCase();
    }
}
