package interfaces;

import models.*;

public interface IGame {

    /*
        -users the two players
     */

    public void start(Player[] players);

    public static String Dummy() {
        return "";
    }
    
    //public void playersMove(Player[] players, Clock c);

}
