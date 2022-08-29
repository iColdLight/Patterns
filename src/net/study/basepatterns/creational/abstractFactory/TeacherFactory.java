package net.study.basepatterns.creational.abstractFactory;

public interface TeacherFactory {
    BioTeacherI getBioTeacher();
    ChemTeacherI getChemTeacher();
    MathTeacherI getMathTeacher();
}
