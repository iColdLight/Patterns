package net.study.basepatterns.behavioral.strategy;

public class Idle implements State{

    @Override
    public void doActivity() {
        System.out.println("Idle...");
    }
}
