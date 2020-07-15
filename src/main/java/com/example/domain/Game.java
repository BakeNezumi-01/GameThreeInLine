package com.example.domain;

import org.apache.catalina.User;

public class Game {
    //private Id
    private User player1;
    private User player2;
    private String playerComment;

    public Game(User player1, String playerComment) {
    }

    public void setPlayer1(User player1) {
        this.player1 = player1;
    }

    public void setPlayer2(User player2) {
        this.player2 = player2;
    }

    public void setPlayerComment(String playerComment) {
        this.playerComment = playerComment;
    }

    public User getPlayer1() {
        return player1;
    }

    public User getPlayer2() {
        return player2;
    }

    public String getPlayerComment() {
        return playerComment;
    }
}
