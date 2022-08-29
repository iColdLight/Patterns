package net.study.basepatterns.behavioral.strategy;

public class Sleep implements State{

    @Override
    public void doActivity() {
        System.out.println("Sleep...");
    }
}
