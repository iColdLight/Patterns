package net.study.basepatterns.creational.abstractFactory.school;

import net.study.basepatterns.creational.abstractFactory.ChemTeacherI;

public class ChemTeacher implements ChemTeacherI {
    @Override
    public void teachChem() {
        System.out.println("Teaching chemistry");
    }
}
