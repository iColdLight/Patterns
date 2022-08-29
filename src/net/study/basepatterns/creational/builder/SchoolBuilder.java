package net.study.basepatterns.creational.builder;

public abstract class SchoolBuilder {
    School school;

    void buildSchool(){
        school = new School();
    }

    abstract void createName();
    abstract void createAmount();

    School getSchool(){
        return school;
    }
}
