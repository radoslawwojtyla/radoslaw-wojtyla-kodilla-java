package com.kodilla.testing.forum.statistics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StatsData {
    Statistics statistics;
    int usersNumber;
    int postsNumber;
    int commentsNumber;
    double postsAveragePerUser;
    double commentsAveragePerUser;
    double commentsAveragePerPost;

    public StatsData(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getPostsAveragePerUser() {
        return postsAveragePerUser;
    }

    public double getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public double getCommentsAveragePerPost() {
        return commentsAveragePerPost;
    }

    public int calculateAdvStatistics(Statistics statistics) {
        int usersNumber = statistics.usersNames().size();
        int postsNumber = statistics.postsCount();
        int commentsNumber = statistics.commentsCount();
        if (usersNumber > 0) {
            double postsAveragePerUser = postsNumber / usersNumber;
            double commentsAveragePerUser = commentsNumber / usersNumber;
        }
        if (postsNumber > 0) {
            double commentsAveragePerPost = commentsNumber / postsNumber;
        }
        return 0;
    }

    public void showStatistics() {
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Average number of posts per user: " + postsAveragePerUser);
        System.out.println("Average number of comments per user: " + commentsAveragePerUser);
        System.out.println("Average number of comments per post: " + commentsAveragePerPost);
    }
}
