package net.study.basepatterns.behavioral.command;

public class StartCar implements DriveInterface{
    Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.start();
    }
}
