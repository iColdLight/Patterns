package net.study.basepatterns.creational.abstractFactory.school;

import net.study.basepatterns.creational.abstractFactory.BioTeacherI;
import net.study.basepatterns.creational.abstractFactory.ChemTeacherI;
import net.study.basepatterns.creational.abstractFactory.MathTeacherI;
import net.study.basepatterns.creational.abstractFactory.TeacherFactory;

public class SchoolTeachersFactory implements TeacherFactory {
    @Override
    public BioTeacherI getBioTeacher() {
        return new BioTeacher();
    }

    @Override
    public ChemTeacherI getChemTeacher() {
        return new ChemTeacher();
    }

    @Override
    public MathTeacherI getMathTeacher() {
        return new MathTeacher();
    }
}
