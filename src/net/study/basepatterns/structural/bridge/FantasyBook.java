package net.study.basepatterns.structural.bridge;

public class FantasyBook extends Book{
    public FantasyBook(Writer writer) {
        super(writer);
    }

    @Override
    public void createBook() {
        System.out.println("Fantasy book is being written...");
        writer.writeBook();
    }
}
