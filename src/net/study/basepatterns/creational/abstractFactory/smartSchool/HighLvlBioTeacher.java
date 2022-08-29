package net.study.basepatterns.creational.abstractFactory.smartSchool;

import net.study.basepatterns.creational.abstractFactory.BioTeacherI;

public class HighLvlBioTeacher implements BioTeacherI {
    @Override
    public void teachBio() {
        System.out.println("Teaching high level biology");
    }
}
