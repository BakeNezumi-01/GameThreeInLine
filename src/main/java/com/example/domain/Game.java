package com.example.domain;


import com.example.domain.User;
import com.example.service.UserService;


public class Game {
    private User user1;
    private User user2;
    private String comment;

    private UserService userService = new UserService();


    public void setUser1(String user1) {
        this.user1 = (User) userService.loadUserByUsername(user1);
    }

    //setters are different, it is ok
    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User getUser1() {
        return user1;
    }

    public User getUser2() {
        return user2;
    }

    public String getComment() {
        return comment;
    }
}
