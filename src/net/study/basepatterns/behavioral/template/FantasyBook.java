package net.study.basepatterns.behavioral.template;

public class FantasyBook extends BookTemplate{
    @Override
    public void writeBookContent() {
        System.out.println("Fantasy...");
    }
}
