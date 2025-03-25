package com.ljw.dp.creation.factory;

public class RobotFactory {

    public static Robot createPinkRobot() {
        return new Robot("pink");
    }

    public static Robot createGoldRobot() {
        return new Robot("gold");
    }

    public static Robot createRedCameraDrone() {
        return new Drone("red","Camera");
    }
    public static Robot createBlueCameraDrone() {
        return new Drone("blue","Camera");
    }

    public static Robot createYellowAttackDrone() {
        return new Drone("yellow","LMG");
    }

    public static Robot createGreenSpiderBot() {
        return new Crawler("green","Blow-Torch",8);
    }
}
