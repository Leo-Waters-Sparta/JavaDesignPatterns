package com.ljw.dp.creation.factory;

public class Robot {

    protected String colour;

    public Robot(String colour) {
        this.colour = colour;
    }

    public void log(){
        System.out.println(colour+" robot");
    }
}
