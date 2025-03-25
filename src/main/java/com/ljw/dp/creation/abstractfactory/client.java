package com.ljw.dp.creation.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class client
{
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<Robot>();

        List<AbstractRobotFactory> factories = List.of(new DroneFactory(),new CrawlerFactory());

        for (AbstractRobotFactory factory : factories){
            robots.add(factory.createRedRobot());
            robots.add(factory.createBlueRobot());
        }

        for (Robot robot : robots){
            robot.log();
        }
    }
}
