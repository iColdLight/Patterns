package net.study.basepatterns.structural.bridge;

public abstract class Book {
    protected Writer writer;

    public Book(Writer writer) {
        this.writer = writer;
    }

    public abstract void createBook();
}
