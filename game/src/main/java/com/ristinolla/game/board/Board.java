package com.ristinolla.game.board;

public class Board extends Square {
    private Square one_one;
    private Square one_two;
    private Square one_three;
    private Square two_one;
    private Square two_two;
    private Square two_three;
    private Square thr_one;
    private Square thr_two;
    private Square thr_three;

    private boolean Xturn;

    public Board(){
        this.one_one = new Square();
        this.one_two = new Square();
        this.one_three = new Square();

        this.two_one = new Square();
        this.two_two = new Square();
        this.two_three = new Square();

        this.thr_one = new Square();
        this.thr_two = new Square();
        this.thr_three = new Square();

        this.Xturn = true;
    }

    public String toString(){
        if (Xturn == true) {
            return
            one_one.toString() + " | " + one_two.toString() + " | " + one_three.toString() + "<br>" +
            two_one.toString() + " | " + two_two.toString() + " | " + two_three.toString() + "<br>" +
            thr_one.toString() + " | " + thr_two.toString() + " | " + thr_three.toString() + "<br>" +
            "X's turn";
        }
        else {
            return
            one_one.toString() + " | " + one_two.toString() + " | " + one_three.toString() + "<br>" +
            two_one.toString() + " | " + two_two.toString() + " | " + two_three.toString() + "<br>" +
            thr_one.toString() + " | " + thr_two.toString() + " | " + thr_three.toString() + "<br>" +
            "0's turn";
        }
    }

    public String play(int row, int col){
        if (this.Xturn == true) {
            if (row == 1 && col == 1 && this.one_one.getSymbol().equals("[ ]")) {
                this.one_one.setSymbol("X");
                this.Xturn = false;
            }
            if (row == 1 && col == 2 && this.one_two.getSymbol().equals("[ ]")) {
                this.one_two.setSymbol("X");
                this.Xturn = false;
            }
            if (row == 1 && col == 3 && this.one_three.getSymbol().equals("[ ]")) {
                this.one_three.setSymbol("X");
                this.Xturn = false;
            }
            if (row == 2 && col == 1 && this.two_one.getSymbol().equals("[ ]")) {
                this.two_one.setSymbol("X");
                this.Xturn = false;
            }
            if (row == 2 && col == 2 && this.two_two.getSymbol().equals("[ ]")) {
                this.two_two.setSymbol("X");
                this.Xturn = false;
            }
            if (row == 2 && col == 3 && this.two_three.getSymbol().equals("[ ]")) {
                this.two_three.setSymbol("X");
                this.Xturn = false;
            }
            if (row == 3 && col == 1 && this.thr_one.getSymbol().equals("[ ]")) {
                this.thr_one.setSymbol("X");
                this.Xturn = false;
            }
            if (row == 3 && col == 2 && this.thr_two.getSymbol().equals("[ ]")) {
                this.thr_two.setSymbol("X");
                this.Xturn = false;
            }
            if (row == 3 && col == 3 && this.thr_three.getSymbol().equals("[ ]")) {
                this.thr_three.setSymbol("X");
                this.Xturn = false;
            }
            winCheck();
            return "OK";
        } else {
            if (row == 1 && col == 1 && this.one_one.getSymbol().equals("[ ]")) {
                this.one_one.setSymbol("0");
                this.Xturn = true;
            }
            if (row == 1 && col == 2 && this.one_two.getSymbol().equals("[ ]")) {
                this.one_two.setSymbol("0");
                this.Xturn = true;
            }
            if (row == 1 && col == 3 && this.one_three.getSymbol().equals("[ ]")) {
                this.one_three.setSymbol("0");
                this.Xturn = true;
            }
            if (row == 2 && col == 1 && this.two_one.getSymbol().equals("[ ]")) {
                this.two_one.setSymbol("0");
                this.Xturn = true;
            }
            if (row == 2 && col == 2 && this.two_two.getSymbol().equals("[ ]")) {
                this.two_two.setSymbol("0");
                this.Xturn = true;
            }
            if (row == 2 && col == 3 && this.two_three.getSymbol().equals("[ ]")) {
                this.two_three.setSymbol("0");
                this.Xturn = true;
            }
            if (row == 3 && col == 1 && this.thr_one.getSymbol().equals("[ ]")) {
                this.thr_one.setSymbol("0");
                this.Xturn = true;
            }
            if (row == 3 && col == 2 && this.thr_two.getSymbol().equals("[ ]")) {
                this.thr_two.setSymbol("0");
                this.Xturn = true;
            }
            if (row == 3 && col == 3 && this.thr_three.getSymbol().equals("[ ]")) {
                this.thr_three.setSymbol("0");
                this.Xturn = true;
            }
            winCheck();
            return "OK";
        }
    }

    public void winCheck(){
        if (one_one.getSymbol().equals(one_two.getSymbol()) && one_one.getSymbol().equals(one_three.getSymbol()) && one_one.getSymbol().equals("[ ]") != true) {
            System.out.println(one_one.getSymbol() + " has won!");
        }
        if (two_one.getSymbol().equals(two_two.getSymbol()) && two_one.getSymbol().equals(two_three.getSymbol()) && two_one.getSymbol().equals("[ ]") != true) {
            System.out.println(two_one.getSymbol() + " has won!");
        }
        if (thr_one.getSymbol().equals(thr_two.getSymbol()) && thr_one.getSymbol().equals(thr_three.getSymbol()) && thr_one.getSymbol().equals("[ ]") != true) {
            System.out.println(thr_one.getSymbol() + " has won!");
        }
        if (one_one.getSymbol().equals(two_one.getSymbol()) && one_one.getSymbol().equals(thr_one.getSymbol()) && one_one.getSymbol().equals("[ ]") != true) {
            System.out.println(one_one.getSymbol() + " has won!");
        }
        if (one_two.getSymbol().equals(two_two.getSymbol()) && one_two.getSymbol().equals(thr_two.getSymbol()) && one_two.getSymbol().equals("[ ]") != true) {
            System.out.println(one_two.getSymbol() + " has won!");
        }
        if (one_three.getSymbol().equals(two_three.getSymbol()) && one_three.getSymbol().equals(thr_three.getSymbol()) && one_three.getSymbol().equals("[ ]") != true) {
            System.out.println(one_three.getSymbol() + " has won!");
        }
        if (one_one.getSymbol().equals(two_two.getSymbol()) && one_one.getSymbol().equals(thr_three.getSymbol()) && one_one.getSymbol().equals("[ ]") != true) {
            System.out.println(one_one.getSymbol() + " has won!");
        }
        if (one_three.getSymbol().equals(two_two.getSymbol()) && one_one.getSymbol().equals(thr_one.getSymbol()) && one_three.getSymbol().equals("[ ]") != true) {
            System.out.println(one_three.getSymbol() + " has won!");
        }
    }
}
