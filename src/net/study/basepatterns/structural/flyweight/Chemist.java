package net.study.basepatterns.structural.flyweight;

public class Chemist implements LabWorker {
    @Override
    public void workInLab() {
        System.out.println("Chemist works with chemicals...");
    }
}
