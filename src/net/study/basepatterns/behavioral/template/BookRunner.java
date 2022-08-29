package net.study.basepatterns.behavioral.template;

public class BookRunner {
    public static void main(String[] args) {
        BookTemplate fantasy = new FantasyBook();
        BookTemplate detective = new DetectiveBook();

        fantasy.showBook();
        detective.showBook();
    }
}
