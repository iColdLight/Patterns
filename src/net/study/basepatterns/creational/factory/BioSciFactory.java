package net.study.basepatterns.creational.factory;

public class BioSciFactory implements ScientistFactory{
    @Override
    public Scientist createScientist() {
        return new BioScientist();
    }
}
