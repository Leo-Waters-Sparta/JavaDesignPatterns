package com.ljw.dp.creation.builder;

public class Client {
    public static void main(String[] args) {

        RobotBuilder rb = new RobotBuilder();

        rb.setModel("Spider");
        rb.setLegs(8);
        rb.setAttachment("Web blaster");
        rb.setColour("blue");


        Robot r = rb.build();
        r.log();

        RobotBuilder rb2 = new RobotBuilder();

        rb2.setModel("Spider");
        rb2.setBlade(4);
        rb2.setAttachment("Web blaster");
        rb2.setColour("red");


        Robot r2 = rb2.build();
        r2.log();
    }
}
