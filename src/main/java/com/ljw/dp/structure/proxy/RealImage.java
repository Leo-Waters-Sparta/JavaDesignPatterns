package com.ljw.dp.structure.proxy;

public class RealImage  implements  Image {

    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
        System.out.println("real image " + filename + " loading");
    }

    @Override
    public void display() {
        System.out.println("real image " + filename + " displaying");
    }
}
