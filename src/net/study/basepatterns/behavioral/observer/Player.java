package net.study.basepatterns.behavioral.observer;

public class Player {
    public static void main(String[] args) {
        Spotify spotify = new Spotify();

        spotify.addSong("Song 1");
        spotify.addSong("Song 2");

        Listener listener1 = new MusicListener("Vova");
        Listener listener2 = new MusicListener("Ivan");

        spotify.addListener(listener1);
        spotify.addListener(listener2);

        spotify.addSong("Song 3");
        spotify.removeSong("Song 1");

    }
}
