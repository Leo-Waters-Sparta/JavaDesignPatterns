package com.ljw.dp.creation.factory;

public class Crawler extends Robot {
    protected String attachment;
    protected int legCount;

    public Crawler(String colour, String attachment,int legCount) {
        super(colour);
        this.attachment = attachment;
        this.legCount=legCount;
    }

    @Override
    public void log() {
        System.out.println(colour+" "+legCount+" legged crawler with " + attachment);
    }
}
