package net.study.basepatterns.behavioral.visitor;

public class Senoir implements Student{
    @Override
    public void study(Math math) {
        System.out.println("Senior studies math");
    }

    @Override
    public void study(Biology biology) {
        System.out.println("Senior studies biology");
    }
}
