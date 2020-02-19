package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatsDataTestSuite {

    @Test
    public void test0posts0users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();
        int posts = 0;

        when(statisticsMock.usersNames()).thenReturn(userNumbers0);
        when(statisticsMock.postsCount()).thenReturn(posts);

        statsData.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
    }

    @Test
    public void test1000posts0users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();
        int posts = 1000;

        when(statisticsMock.usersNames()).thenReturn(userNumbers0);
        when(statisticsMock.postsCount()).thenReturn(posts);

        statsData.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, statsData.getPostsAveragePerUser(), 1e-8);
    }

    @Test
    public void test0posts100users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        ArrayList<String> userNumbers100 = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            userNumbers100.add("Unknown User");
        }
        int posts = 0;

        when(statisticsMock.usersNames()).thenReturn(userNumbers100);
        when(statisticsMock.postsCount()).thenReturn(posts);

        statsData.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
    }

    @Test
    public void test1000posts100users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        ArrayList<String> userNumbers100 = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            userNumbers100.add("Unknown User");
        }
        int posts = 1000;

        when(statisticsMock.usersNames()).thenReturn(userNumbers100);
        when(statisticsMock.postsCount()).thenReturn(posts);

        statsData.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(10, statsData.getPostsAveragePerUser(),1e-8);
    }

    @Test
    public void test0comments0users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();
        int comments = 0;

        when(statisticsMock.usersNames()).thenReturn(userNumbers0);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        statsData.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, statsData.getCommentsAveragePerUser(),1e-8);
    }

    @Test
    public void test100comments0users() {
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();
        int comments = 100;

        when(statisticsMock.usersNames()).thenReturn(userNumbers0);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        statsData.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, statsData.getCommentsAveragePerUser(),1e-8);
    }

    @Test
    public void moreCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        int posts = 10;
        int comments = 100;

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        statsData.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(10, statsData.getCommentsAveragePerPost(),1e-8);
    }

    @Test
    public void lessCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        int posts = 10;
        int comments = 100;

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        statsData.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0.1, statsData.getCommentsAveragePerPost(),1e-8);
    }
}

