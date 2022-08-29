package net.study.basepatterns.behavioral.strategy;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.setState(new Active());
        robot.doActivity();

        robot.setState(new Idle());
        robot.doActivity();

        robot.setState(new Sleep());
        robot.doActivity();

        robot.setState(new Active());
        robot.doActivity();
    }
}
