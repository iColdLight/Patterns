package net.study.basepatterns.behavioral.strategy;

public class Active implements State{

    @Override
    public void doActivity() {
        System.out.println("Active...");
    }
}
