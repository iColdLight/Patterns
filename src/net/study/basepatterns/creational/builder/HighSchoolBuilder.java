package net.study.basepatterns.creational.builder;

public class HighSchoolBuilder extends SchoolBuilder{
    @Override
    void createName() {
        school.setName("High school");
    }

    @Override
    void createAmount() {
        school.setStudentAmount(500);
    }
}
