package net.study.basepatterns.behavioral.command;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        Driver driver = new Driver(
                new StartCar(car),
                new DriveCarForward(car),
                new TurnCar(car)
        );

        driver.startCar();
        driver.driveCarForward();
        driver.turnCar();

    }
}
