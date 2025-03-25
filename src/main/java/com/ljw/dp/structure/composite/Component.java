package com.ljw.dp.structure.composite;

public class Component {

    private String name;
    private int price;

    public Component(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
