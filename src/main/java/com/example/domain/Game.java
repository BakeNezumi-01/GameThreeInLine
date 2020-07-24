package com.example.domain;


import com.example.domain.User;

public class Game {
    private User user1;
    private User user2;
    private String comment;

    public Game(User user1, String comment) {
        this.user1 = user1;
        this.comment = comment;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public void setUserComment(String userComment) {
        this.comment = userComment;
    }

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    public String getUserComment() {
        return comment;
    }
}
