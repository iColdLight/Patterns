package net.study.basepatterns.behavioral.observer;

import java.util.List;

public class MusicListener implements Listener{
    String name;

    public MusicListener(String name) {
        this.name = name;
    }

    @Override
    public void createPlaylist(List<String> songs) {
        System.out.println(name + ", your changed playlist: " + songs);

    }
}
