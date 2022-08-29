package net.study.basepatterns.creational.abstractFactory.smartSchool;

import net.study.basepatterns.creational.abstractFactory.MathTeacherI;

public class HighLvlMathTeacher implements MathTeacherI {
    @Override
    public void teachMath() {
        System.out.println("Teaching high level math");
    }
}
