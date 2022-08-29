package net.study.basepatterns.structural.facade;

public class Writer {
    public void finishBook(ProgressChecker progressChecker){
        if(progressChecker.isWritingInProgress()){
            System.out.println("Writing an interesting book...");
        } else{
            System.out.println("Chilling");
        }
    }
}
