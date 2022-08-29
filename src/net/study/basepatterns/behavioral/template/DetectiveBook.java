package net.study.basepatterns.behavioral.template;

public class DetectiveBook extends BookTemplate{
    @Override
    public void writeBookContent() {
        System.out.println("Detective...");
    }
}
