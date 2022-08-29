package net.study.basepatterns.behavioral.memento;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        Cloud cloud = new Cloud();

        System.out.println("New game. Level 5");
        game.setLevelAndDate("Level 5");
        System.out.println(game);

        System.out.println("Saving progress...");
        cloud.setSave(game.save());

        System.out.println("Playing the game. Level 6");
        Thread.sleep(5_000);
        game.setLevelAndDate("Level 6");
        System.out.println(game);

        System.out.println("You died");
        System.out.println("You are now at level 3");
        game.load(cloud.getSave());

        System.out.println("Your saved progress");
        System.out.println(game);

    }
}
