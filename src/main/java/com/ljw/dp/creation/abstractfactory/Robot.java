package com.ljw.dp.creation.abstractfactory;

public class Robot {
    String model;
    String colour;
    public Robot(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    public void log(){
        System.out.println(colour + " "+model);
    }
}
