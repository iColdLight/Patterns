package net.study.basepatterns.structural.flyweight;

public class Biologist implements LabWorker{
    @Override
    public void workInLab() {
        System.out.println("Biologist works with bacteria...");
    }
}
