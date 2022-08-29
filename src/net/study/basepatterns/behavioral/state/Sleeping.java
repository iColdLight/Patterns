package net.study.basepatterns.behavioral.state;

public class Sleeping implements State{
    @Override
    public void activity() {
        System.out.println("Sleeping ...");
    }
}
