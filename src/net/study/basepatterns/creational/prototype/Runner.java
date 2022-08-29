package net.study.basepatterns.creational.prototype;

public class Runner {
    public static void main(String[] args) {
        Book control = new Book ("Sherlock", 103, "Text...");

        System.out.println(control);
        BookFactory bookFactory = new BookFactory(control);
        Book clone = bookFactory.cloneBook();

        System.out.println("-------------------------------------");
        System.out.println(clone);
    }
}
