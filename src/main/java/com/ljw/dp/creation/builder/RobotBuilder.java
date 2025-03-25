package com.ljw.dp.creation.builder;

public class RobotBuilder {
    private String model="basic";
    private String colour="black";
    private String attachment="no";
    private int legs=2;
    private int blade=0;

    public RobotBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public RobotBuilder setColour(String colour) {
        this.colour = colour;
        return this;
    }
    public RobotBuilder setAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }
    public RobotBuilder setLegs(int legs) {
        this.blade=0;
        this.legs = legs;
        return this;
    }
    public RobotBuilder setBlade(int blade) {
        this.legs=0;
        this.blade = blade;
        return this;
    }

    public Robot build() {
        return new Robot(model, colour, attachment, legs, blade);
    }
}
