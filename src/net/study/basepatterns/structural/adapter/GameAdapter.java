package net.study.basepatterns.structural.adapter;

public class GameAdapter extends GameStructure implements Game{
    @Override
    public void save() {
        saveGame();
    }

    @Override
    public void load() {
        loadGame();
    }

    @Override
    public void getExp() {
        getExpUpGame();
    }

    @Override
    public void fight() {
        fightGame();
    }
}
