package net.study.basepatterns.structural.bridge;

public class BookCreator {
    public static void main(String[] args) {
        Book[] books = {
                new DetectiveBook(new HighLvlWriter()),
                new FantasyBook(new LowLvlWriter())
        };

        for(Book book: books){
            book.createBook();
        }
    }
}
