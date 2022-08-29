package net.study.basepatterns.behavioral.visitor;

public class HomeworkClass implements Homework{
    Homework[] hw;

    public HomeworkClass() {
        this.hw = new Homework[]{
                new Math(),
                new Biology()
        };
    }

    @Override
    public void toBeDone(Student student) {
        for(Homework subject: hw){
            subject.toBeDone(student);
        }
    }
}
