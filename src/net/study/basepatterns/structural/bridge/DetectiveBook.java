package net.study.basepatterns.structural.bridge;

public class DetectiveBook extends Book{
    public DetectiveBook(Writer writer) {
        super(writer);
    }

    @Override
    public void createBook() {
        System.out.println("Detective book is being written...");
        writer.writeBook();
    }
}
