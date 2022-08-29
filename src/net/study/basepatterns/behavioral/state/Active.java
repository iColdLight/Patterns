package net.study.basepatterns.behavioral.state;

public class Active implements State{
    @Override
    public void activity() {
        System.out.println("Active...");
    }
}
