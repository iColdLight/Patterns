package net.study.basepatterns.behavioral.template;

public abstract class BookTemplate {
    public void showBook(){
        System.out.println("Intro");
        writeBookContent();
        System.out.println("Denouement");
    }

    public abstract void writeBookContent();
}
