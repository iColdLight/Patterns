package net.study.basepatterns.structural.composite;

public class Journal {
    public static void main(String[] args) {
        Team team = new Team();

        Writer juniorWriter = new ArticleWriter();
        Writer seniorWriter = new ArticleWriter();
        Writer headerWriter = new HeaderWriter();

        team.addWriter(juniorWriter);
        team.addWriter(seniorWriter);
        team.addWriter(headerWriter);

        team.writeJournal();


    }
}
