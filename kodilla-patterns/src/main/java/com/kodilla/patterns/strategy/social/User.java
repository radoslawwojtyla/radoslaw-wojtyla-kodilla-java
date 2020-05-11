package com.kodilla.patterns.strategy.social;

public class User {
    String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String show() {
        return socialPublisher.share();
    }

    public void setSocialMedia(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
