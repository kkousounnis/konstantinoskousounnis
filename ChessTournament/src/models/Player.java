package models;

import interfaces.*;

public class Player extends Naming implements IPlayer {
    private int counter = 0;
    public Player() {

    }

    public Player(String name) {
        this.setName(name);
        System.out.println(name);
    }
    
    /*
        In this method we need to figure out
        which move the player does.
    */
    @Override
    public String moves(Game game) {
        String result = "";
        counter++;
        result = Integer.toString(counter);
        return result;
    }
    
}
