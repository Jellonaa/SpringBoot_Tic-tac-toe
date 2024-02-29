package com.ristinolla.game.board;

public class Square {
    private String symbol;

    public Square(){
        this.symbol = "[ ]";
    }

    public String getSymbol(){
        return this.symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public String toString(){
        return this.symbol;
    }
}
