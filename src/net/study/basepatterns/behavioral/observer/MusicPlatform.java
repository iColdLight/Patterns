package net.study.basepatterns.behavioral.observer;

public interface MusicPlatform {
    public void addListener(Listener listener);

    public void removeListener(Listener listener);

    public void notifyListener ();

}
