package net.study.basepatterns.structural.decorator;

public class JuniorLabWorker implements LabWorker{
    @Override
    public String work() {
        return "Do simple lab work.";
    }
}
