package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStatistics {

    private Statistics statistics;
    private double usersCount;
    private double postsCount;
    private double commentsCount;
    private double averageCountPostsUser;
    private double averageCountCommentsUser;
    private double averageCountCommentsPerPost;


    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(double usersCount) {
        this.usersCount = usersCount;
    }

    public double getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(double postsCount) {
        this.postsCount = postsCount;
    }

    public double getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(double commentsCount) {
        this.commentsCount = commentsCount;
    }

    public double getAverageCountPostsUser() {
        return averageCountPostsUser;
    }

    public void setAverageCountPostsUser(double averageCountPostsUser) {
        this.averageCountPostsUser = averageCountPostsUser;
    }

    public double getAverageCountCommentsUser() {
        return averageCountCommentsUser;
    }

    public void setAverageCountCommentsUser(double averageCountCommentsUser) {
        this.averageCountCommentsUser = averageCountCommentsUser;
    }

    public double getAverageCountCommentsPerPost() {
        return averageCountCommentsPerPost;
    }

    public void setAverageCountCommentsPerPost(double averageCountCommentsPerPost) {
        this.averageCountCommentsPerPost = averageCountCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        usersCount = statistics.usersNames().size();

        if(postsCount != 0) {
            averageCountCommentsPerPost = commentsCount / postsCount;
        }

        if(usersCount != 0) {
            averageCountCommentsUser = commentsCount / usersCount;
            averageCountPostsUser =  postsCount/ usersCount;
        }

    }

    public String showStatistics() {
        return "Średnia liczba postów na uzytkownika: " + averageCountPostsUser + ", " + "Średnia liczba komentarzy na uzytkownika: " + averageCountCommentsUser +
        " " + "Średnia liczba komentarzy na post: " + averageCountCommentsPerPost;
    }
}
