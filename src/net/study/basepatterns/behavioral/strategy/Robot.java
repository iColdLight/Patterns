package net.study.basepatterns.behavioral.strategy;

public class Robot {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doActivity(){
        state.doActivity();
    }
}
