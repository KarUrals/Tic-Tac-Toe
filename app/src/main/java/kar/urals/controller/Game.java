package kar.urals.controller;

import kar.urals.model.Player;

public class Game {

    private static final String GAME_NAME = "XO";
    private Player[] players;

    public String getGameName() {
        return GAME_NAME;
    }
    public Player[] getPlayers() {
        return players;
    }


    public Player currentPlayer() {
        return null;
    }

    public boolean move(int x, int y) {
        return false;
    }
}
