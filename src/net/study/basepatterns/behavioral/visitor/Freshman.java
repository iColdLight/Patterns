package net.study.basepatterns.behavioral.visitor;

public class Freshman implements Student{
    @Override
    public void study(Math math) {
        System.out.println("Freshman studies math");
    }

    @Override
    public void study(Biology biology) {
        System.out.println("Freshman studies biology");
    }
}
