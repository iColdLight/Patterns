package net.study.basepatterns.structural.composite;

public class ArticleWriter implements Writer{
    @Override
    public void writeText() {
        System.out.println("Article writer writes articles");
    }
}
