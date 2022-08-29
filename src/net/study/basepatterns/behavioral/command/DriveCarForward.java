package net.study.basepatterns.behavioral.command;

public class DriveCarForward implements DriveInterface{
    Car car;

    public DriveCarForward(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.driveForward();
    }
}
