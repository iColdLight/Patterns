package net.study.basepatterns.behavioral.command;

public class Driver {
    DriveInterface start;
    DriveInterface driveForward;
    DriveInterface turn;

    public Driver(DriveInterface start, DriveInterface driveForward, DriveInterface turn) {
        this.start = start;
        this.driveForward = driveForward;
        this.turn = turn;
    }

    public void startCar(){
        start.drive();
    }

    public void driveCarForward(){
        driveForward.drive();
    }

    public void turnCar(){
        turn.drive();
    }
}
