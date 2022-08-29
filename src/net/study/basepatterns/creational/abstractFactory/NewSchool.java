package net.study.basepatterns.creational.abstractFactory;

import net.study.basepatterns.creational.abstractFactory.school.SchoolTeachersFactory;

public class NewSchool {
    public static void main(String[] args) {
        TeacherFactory teacherFactory = new SchoolTeachersFactory();

        BioTeacherI bioTeacher = teacherFactory.getBioTeacher();
        ChemTeacherI chemTeacher = teacherFactory.getChemTeacher();
        MathTeacherI mathTeacher = teacherFactory.getMathTeacher();

        System.out.println("Teaching in regular school");

        bioTeacher.teachBio();
        chemTeacher.teachChem();
        mathTeacher.teachMath();

    }
}
