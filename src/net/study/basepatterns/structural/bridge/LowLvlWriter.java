package net.study.basepatterns.structural.bridge;

public class LowLvlWriter implements Writer{
    @Override
    public void writeBook() {
        System.out.println("Low lvl writer is writing...");
    }
}
