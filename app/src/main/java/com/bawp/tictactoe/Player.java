package com.bawp.tictactoe;

public class Player {
    private int playerNumber;
    private String symbol = null;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Player(int player, String sym) {
        playerNumber = player;
        sym = symbol;


    }
}
