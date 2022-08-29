package net.study.basepatterns.structural.decorator;

public class PhDStudent extends LabWorkerDecorator {

    public PhDStudent(LabWorker labWorker) {
        super(labWorker);
    }

    public String help(){
        return " Helps to do work.";
    }

    @Override
    public String work() {
        return super.work() + help();
    }
}
