package net.study.basepatterns.creational.builder;

public class MiddleSchoolBuilder extends SchoolBuilder{
    @Override
    void createName() {
        school.setName("Middle school");
    }

    @Override
    void createAmount() {
        school.setStudentAmount(1000);
    }
}
