package net.study.basepatterns.creational.factory;

public class ChemSciFactory implements ScientistFactory{
    @Override
    public Scientist createScientist() {
        return new ChemScientist();
    }
}
