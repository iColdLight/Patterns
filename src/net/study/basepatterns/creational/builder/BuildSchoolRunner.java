package net.study.basepatterns.creational.builder;

public class BuildSchoolRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setSchoolBuilder(new HighSchoolBuilder());
        School school = director.buildSchool();

        System.out.println(school);
    }
}
