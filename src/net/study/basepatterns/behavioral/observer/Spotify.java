package net.study.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Spotify implements MusicPlatform{
   List<String> songs = new ArrayList<>();
   List<Listener> listeners = new ArrayList<>();

   public void addSong (String song){
       this.songs.add(song);
       notifyListener();
   }
    public void removeSong (String song){
        this.songs.remove(song);
        notifyListener();
    }

    @Override
    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void notifyListener() {
        for(Listener listener: listeners)
            listener.createPlaylist(this.songs);
    }
}
