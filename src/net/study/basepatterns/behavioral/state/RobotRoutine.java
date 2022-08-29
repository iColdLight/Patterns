package net.study.basepatterns.behavioral.state;

public class RobotRoutine {
    public static void main(String[] args) {
        State state = new Sleeping();
        Robot robot = new Robot();

        robot.setState(state);

        for(int i = 0; i< 15; i++){
            robot.activity();
            robot.changeState();
        }
    }
}
