package net.study.basepatterns.behavioral.memento;

import java.util.Date;

public class Game {
    private String level;
    private Date date;

    public void setLevelAndDate(String level){
        this.level = level;
        this.date = new Date();
    }

    public Save save (){
        return new Save(level);
    }

    public void load(Save save){
        level = save.getLevel();
        date = save.getDate();
    }


    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", date=" + date +
                '}';
    }
}
