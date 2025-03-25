package com.ljw.dp.creation.abstractfactory;

public class CrawlerFactory extends AbstractRobotFactory {
    @Override
    public Robot createRedRobot() {
        return new Robot("Crawler","Red");
    }

    @Override
    public Robot createBlueRobot() {
        return new Robot("Crawler","Blue");
    }
}
