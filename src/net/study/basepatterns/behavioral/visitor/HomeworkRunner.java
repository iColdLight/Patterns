package net.study.basepatterns.behavioral.visitor;

public class HomeworkRunner {
    public static void main(String[] args) {
        HomeworkClass homeworkClass = new HomeworkClass();

        Student freshman = new Freshman();
        Student senior = new Senoir();

        System.out.println("Freshman studies...");
        homeworkClass.toBeDone(freshman);

        System.out.println("Senior studies...");
        homeworkClass.toBeDone(senior);
    }
}
