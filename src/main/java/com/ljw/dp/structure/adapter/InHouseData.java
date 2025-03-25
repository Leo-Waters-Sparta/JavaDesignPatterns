package com.ljw.dp.structure.adapter;

public class InHouseData {
    private String name;
    private String age;
    private String gender;
    public InHouseData(String name, String age, String gender) {
        this.name = name.toLowerCase();
        this.age = age;
        this.gender = gender;
    }

    public void log(){
        System.out.println(this.name + " " + this.age + " " + this.gender);
    }
}
