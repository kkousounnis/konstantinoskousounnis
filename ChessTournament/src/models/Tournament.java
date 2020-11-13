package models;

import interfaces.*;
import java.util.ArrayList;
import java.util.List;

public class Tournament extends Naming implements ITournament {

    private Game[] games;
    private List<Player> players = new ArrayList<Player>();

    public Tournament() {
        System.out.println("Welcome Ultimate Chess Tournament 2020");
    }

    public Tournament(String n) {
        this.setName(n);
        System.out.println("Welcome to the " + this.getName());
        introducePlayers(players);

        games = new Game[]{
            new Game("Game 1", new Player[]{players.get(0), players.get(1)}),
            new Game("Game 2", new Player[]{players.get(0), players.get(2)}),
            new Game("Game 3", new Player[]{players.get(0), players.get(3)})
        };

    }

    @Override
    public void introducePlayers(List<Player> players) {
        System.out.print(this.getName() + "Introduces ");
        players.add(new Player("Paspa"));

        System.out.print(this.getName() + "Introduces ");
        players.add(new Player("Gasparov"));

        System.out.print(this.getName() + "Introduces ");
        players.add(new Player("Karpav"));

        System.out.print(this.getName() + "Introduces ");
        players.add(new Player("Medved"));
    }

}
