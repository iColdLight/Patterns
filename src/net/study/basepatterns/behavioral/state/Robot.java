package net.study.basepatterns.behavioral.state;

public class Robot {
    State state;

    public void setState(State state) {
        this.state = state;
    }

    public void changeState(){
        if(state instanceof Active){
            setState(new Idle());
        } else if (state instanceof Idle){
            setState(new Sleeping());
        } else if (state instanceof Sleeping){
            setState(new Active());
        }
    }

    public void activity(){
        state.activity();
    }
}
