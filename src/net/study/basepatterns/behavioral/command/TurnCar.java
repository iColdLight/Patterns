package net.study.basepatterns.behavioral.command;

public class TurnCar implements DriveInterface{
    Car car;

    public TurnCar(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.turn();
    }
}
