package net.study.basepatterns.behavioral.memento;

import java.util.Date;

public class Save {
    private final String level;
    private final Date date;

    public String getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }

    public Save(String level) {
        this.level = level;
        this.date = new Date();
    }
}
