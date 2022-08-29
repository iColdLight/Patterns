package net.study.basepatterns.creational.abstractFactory.school;

import net.study.basepatterns.creational.abstractFactory.BioTeacherI;

public class BioTeacher implements BioTeacherI {
    @Override
    public void teachBio() {
        System.out.println("Teaching biology");
    }
}
