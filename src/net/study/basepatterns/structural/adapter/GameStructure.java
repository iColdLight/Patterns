package net.study.basepatterns.structural.adapter;

public class GameStructure {
    public void saveGame(){
        System.out.println("Saving the game progress...");
    }

    public void loadGame(){
        System.out.println("Loading...");
    }

    public void getExpUpGame(){
        System.out.println("Got exp...");
    }

    public void fightGame(){
        System.out.println("Fighting...");
    }
}
