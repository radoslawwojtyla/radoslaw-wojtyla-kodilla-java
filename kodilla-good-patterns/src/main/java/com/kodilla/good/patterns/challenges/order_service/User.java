package com.kodilla.good.patterns.challenges.order_service;

public class User {
    String userNick;
    String userName;
    String userSurname;

    public User(String userNick, String userName, String userSurname) {
        this.userNick = userNick;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserNick() {
        return userNick;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return getUserNick().equals(user.getUserNick());
    }

    @Override
    public int hashCode() {
        return getUserNick().hashCode();
    }
}
