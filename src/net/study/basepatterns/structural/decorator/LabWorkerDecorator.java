package net.study.basepatterns.structural.decorator;

public class LabWorkerDecorator implements LabWorker{
    LabWorker labWorker;

    public LabWorkerDecorator(LabWorker labWorker) {
        this.labWorker = labWorker;
    }

    @Override
    public String work() {
        return labWorker.work();
    }
}
