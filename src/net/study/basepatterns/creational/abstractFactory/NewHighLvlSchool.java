package net.study.basepatterns.creational.abstractFactory;

import net.study.basepatterns.creational.abstractFactory.smartSchool.SmartSchoolTeachersFactory;

public class NewHighLvlSchool {
    public static void main(String[] args) {
        TeacherFactory teacherFactory = new SmartSchoolTeachersFactory();

        BioTeacherI bioTeacher = teacherFactory.getBioTeacher();
        ChemTeacherI chemTeacher = teacherFactory.getChemTeacher();
        MathTeacherI mathTeacher = teacherFactory.getMathTeacher();

        System.out.println("Teaching in smart school");

        bioTeacher.teachBio();
        chemTeacher.teachChem();
        mathTeacher.teachMath();
    }
}
