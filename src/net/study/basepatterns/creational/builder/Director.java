package net.study.basepatterns.creational.builder;

public class Director {
    SchoolBuilder schoolBuilder;

    public void setSchoolBuilder(SchoolBuilder schoolBuilder) {
        this.schoolBuilder = schoolBuilder;
    }

    School buildSchool(){
        schoolBuilder.buildSchool();
        schoolBuilder.createName();
        schoolBuilder.createAmount();

        School school = schoolBuilder.getSchool();

        return school;
    }
}
