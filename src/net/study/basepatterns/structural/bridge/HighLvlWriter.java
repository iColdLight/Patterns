package net.study.basepatterns.structural.bridge;

public class HighLvlWriter implements Writer {
    @Override
    public void writeBook() {
        System.out.println("High lvl writer is writing..");
    }
}

