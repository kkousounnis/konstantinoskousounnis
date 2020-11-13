package models;

import interfaces.IGame;

public class Game extends Naming implements IGame {

    private Player[] players;

    public Game() {
        System.out.println("Game 1");
    }

    public Game(String name, Player[] players) {
        this.setName(name);
        this.start(players);

    }

    @Override
    public void start(Player[] players) {
//        System.out.println(this.getName());
//        System.out.println("Player " + players[0]
//                + " plays against Player " + players[1]);
//        this.players = players;
        int TotalTime = (4 * 15) * 10; // 4 * 15" == 1' * 10 == 10'
        Clock c = new Clock(TotalTime);
        this.playersMove(players, c);
    }

    public void playersMove(Player[] players, Clock c) {
        for (int i = c.getTotalTime(); i > 0; i = i - c.getTick()) {
            System.out.println("Player " + players[0]
                    + " plays move " + players[0].moves(this)
                    + " against player" + players[1]);
            //System.out.println("Time is " + c.Tick());
            System.out.println("Player " + players[1]
                    + " plays move " + players[1].moves(this)
                    + " against player" + players[0]);
            c.setTotalTime(i);
            c.setTotalTime(i);
            System.out.println("Time is " + c.Tick());

        }

    }

}
