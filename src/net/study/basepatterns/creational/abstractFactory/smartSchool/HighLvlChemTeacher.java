package net.study.basepatterns.creational.abstractFactory.smartSchool;

import net.study.basepatterns.creational.abstractFactory.ChemTeacherI;

public class HighLvlChemTeacher implements ChemTeacherI {
    @Override
    public void teachChem() {
        System.out.println("Teaching high level chemistry");
    }
}
