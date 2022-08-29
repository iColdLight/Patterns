package net.study.basepatterns.structural.composite;

public class HeaderWriter implements Writer{
    @Override
    public void writeText() {
        System.out.println("Header writer writes headers");
    }
}
