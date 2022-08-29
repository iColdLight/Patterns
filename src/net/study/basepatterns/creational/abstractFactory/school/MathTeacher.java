package net.study.basepatterns.creational.abstractFactory.school;

import net.study.basepatterns.creational.abstractFactory.MathTeacherI;

public class MathTeacher implements MathTeacherI {
    @Override
    public void teachMath() {
        System.out.println("Teaching math");
    }
}
