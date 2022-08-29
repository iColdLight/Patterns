package net.study.basepatterns.structural.facade;

public class Progress {
    Writer writer = new Writer();
    Book book = new Book();
    ProgressChecker progressChecker = new ProgressChecker();

    public void checkProgress(){
        book.writeBook();
        progressChecker.startWriting();
        writer.finishBook(progressChecker);
    }

}
