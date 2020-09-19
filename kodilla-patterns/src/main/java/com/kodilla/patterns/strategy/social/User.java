package com.kodilla.patterns.strategy.social;

public class User {
    private final String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public String getName() {
        return name;
    }

    public void setCommunicateStrategy (SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
