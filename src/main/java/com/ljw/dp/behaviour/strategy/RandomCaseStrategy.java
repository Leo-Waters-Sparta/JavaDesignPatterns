package com.ljw.dp.behaviour.strategy;

import java.util.Random;

public class RandomCaseStrategy implements PrintStrategy {
    @Override
    public String formatString(String str) {
        StringBuilder sb = new StringBuilder();

        Random random = new Random();
        for(char c : str.toCharArray()) {
            if(random.nextBoolean()){
                sb.append(Character.toUpperCase(c));
            }else {
                sb.append(Character.toLowerCase(c));
            }

        }

        return sb.toString();
    }
}
