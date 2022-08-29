package net.study.basepatterns.structural.adapter;

public class GameStart {
    public static void main(String[] args) {
        Game game = new GameAdapter();

        game.load();
        game.save();
        game.fight();
        game.getExp();
    }
}
