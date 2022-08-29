package net.study.basepatterns.creational.prototype;

public class Book implements Copyable{
    private String name;
    private int pages;
    private String text;

    public Book(String name, int pages, String text) {
        this.name = name;
        this.pages = pages;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Object copy() {
        Book copy = new Book(name, pages, text);
        return copy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", text='" + text + '\'' +
                '}';
    }
}
