package com.ljw.dp.creation.abstractfactory;

public class DroneFactory extends AbstractRobotFactory {
    @Override
    public Robot createRedRobot() {
        return new Robot("Drone","Red");
    }

    @Override
    public Robot createBlueRobot() {
        return new Robot("Drone","Blue");
    }
}
