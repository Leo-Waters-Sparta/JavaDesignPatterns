package com.ljw.dp.creation.factory;

public class Drone extends Robot {
    protected String attachment;

    public Drone(String colour, String attachment) {
        super(colour);
        this.attachment = attachment;
    }

    @Override
    public void log() {
        System.out.println(colour+" drone with " + attachment);
    }
}
