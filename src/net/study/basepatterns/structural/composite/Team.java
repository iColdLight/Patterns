package net.study.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Writer> writers = new ArrayList<Writer>();

    public void addWriter(Writer writer){
        writers.add(writer);
    }

    public void removeWriter(Writer writer){
        writers.remove(writer);
    }

    public void writeJournal(){
        System.out.println("Team is writing a journal");
        for (Writer writer: writers){
            writer.writeText();
        }
    }
}
