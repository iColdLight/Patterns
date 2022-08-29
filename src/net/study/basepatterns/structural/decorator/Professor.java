package net.study.basepatterns.structural.decorator;

public class Professor extends LabWorkerDecorator{

    public Professor(LabWorker labWorker) {
        super(labWorker);
    }

    public String reviewWork(){
        return " Reviews the work done.";
    }

    @Override
    public String work() {
        return super.work() + reviewWork();
    }
}
