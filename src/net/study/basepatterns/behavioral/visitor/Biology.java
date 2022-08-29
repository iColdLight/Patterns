package net.study.basepatterns.behavioral.visitor;

public class Biology implements Homework{
    @Override
    public void toBeDone(Student student) {
        student.study(this);
    }
}
