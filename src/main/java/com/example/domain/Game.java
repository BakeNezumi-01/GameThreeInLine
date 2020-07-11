package com.example.domain;

import org.apache.catalina.User;

public class Game {
    private String player1;
    private String player2;
    private String playerComment;

    public Game(String player1, String playerComment) {
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public void setPlayerComment(String playerComment) {
        this.playerComment = playerComment;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public String getPlayerComment() {
        return playerComment;
    }
}
