package com.ljw.dp.creation.factory;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<Robot>();

        robots.add(RobotFactory.createPinkRobot());
        robots.add(RobotFactory.createGoldRobot());

        robots.add(RobotFactory.createRedCameraDrone());
        robots.add(RobotFactory.createBlueCameraDrone());

        robots.add(RobotFactory.createYellowAttackDrone());
        robots.add(RobotFactory.createGreenSpiderBot());


        for (Robot robot : robots) {
            robot.log();
        }
    }
}
