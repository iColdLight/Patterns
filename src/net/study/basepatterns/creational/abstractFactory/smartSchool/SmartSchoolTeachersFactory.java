package net.study.basepatterns.creational.abstractFactory.smartSchool;

import net.study.basepatterns.creational.abstractFactory.BioTeacherI;
import net.study.basepatterns.creational.abstractFactory.ChemTeacherI;
import net.study.basepatterns.creational.abstractFactory.MathTeacherI;
import net.study.basepatterns.creational.abstractFactory.TeacherFactory;

public class SmartSchoolTeachersFactory implements TeacherFactory {
    @Override
    public BioTeacherI getBioTeacher() {
        return new HighLvlBioTeacher();
    }

    @Override
    public ChemTeacherI getChemTeacher() {
        return new HighLvlChemTeacher();
    }

    @Override
    public MathTeacherI getMathTeacher() {
        return new HighLvlMathTeacher();
    }
}
