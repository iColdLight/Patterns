package net.study.basepatterns.behavioral.state;

public class Idle implements State{
    @Override
    public void activity() {
        System.out.println("Idle...");
    }
}
