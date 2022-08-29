package net.study.basepatterns.structural.decorator;

public class LabProject {
    public static void main(String[] args) {
        LabWorker labWorker = new Professor(new PhDStudent(new JuniorLabWorker()));

        System.out.println(labWorker.work());
    }
}
