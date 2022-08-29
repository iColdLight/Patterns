package net.study.basepatterns.structural.facade;

public class ProgressChecker {
    private boolean writing;

    public boolean isWritingInProgress(){
        return writing;
    }

    public void startWriting(){
        System.out.println("Writing is in progress...");
        writing = true;
    }

    public void finishWriting(){
        System.out.println("Writing is stopped.");
        writing = false;
    }
}
