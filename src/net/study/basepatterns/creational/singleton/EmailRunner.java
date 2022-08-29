package net.study.basepatterns.creational.singleton;

public class EmailRunner {
    public static void main(String[] args) {
        EmailWriter.getEmailWriter().addToEmail("Hello");
        EmailWriter.getEmailWriter().addToEmail("it's");
        EmailWriter.getEmailWriter().addToEmail("me");

        EmailWriter.getEmailWriter().showEmail();
    }
}
