package com.ljw.dp.creation.builder;

public class Robot {
    private String model;
    private String colour;
    private String attachment;
    private int legs;
    private int blade;

    public Robot(String model, String colour, String attachment, int legs, int blade) {
        this.model = model;
        this.colour = colour;
        this.attachment = attachment;
        this.legs = legs;
        this.blade = blade;
    }

    public void log(){

        String type = legs==0?"Drone":"Crawler";

        System.out.println(colour + " "+model + " " + type + " with " + attachment+ " attachment");
    }
}
