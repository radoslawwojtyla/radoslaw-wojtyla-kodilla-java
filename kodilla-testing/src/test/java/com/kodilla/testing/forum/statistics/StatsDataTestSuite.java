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
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(userNumbers0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statsData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statsData.getUsersNumber());
        Assert.assertEquals(0, statsData.getPostsNumber());
        Assert.assertEquals(1000, statsData.getCommentsNumber());
        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerPost(),1e-8);
    }

    @Test
    public void test1000posts0users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(userNumbers0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statsData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statsData.getUsersNumber());
        Assert.assertEquals(1000, statsData.getPostsNumber());
        Assert.assertEquals(1000, statsData.getCommentsNumber());
        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(1, statsData.getCommentsAveragePerPost(),1e-8);
    }

    @Test
    public void test0posts100users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        ArrayList<String> userNumbers100 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userNumbers100.add("Unknown User");
        }

        when(statisticsMock.usersNames()).thenReturn(userNumbers100);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statsData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statsData.getUsersNumber());
        Assert.assertEquals(0, statsData.getPostsNumber());
        Assert.assertEquals(1000, statsData.getCommentsNumber());
        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(10, statsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerPost(),1e-8);
    }

    @Test
    public void test1000posts100users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        ArrayList<String> userNumbers100 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userNumbers100.add("Unknown User");
        }

        when(statisticsMock.usersNames()).thenReturn(userNumbers100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statsData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statsData.getUsersNumber());
        Assert.assertEquals(1000, statsData.getPostsNumber());
        Assert.assertEquals(1000, statsData.getCommentsNumber());
        Assert.assertEquals(10, statsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(10, statsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(1, statsData.getCommentsAveragePerPost(),1e-8);
    }

    @Test
    public void test0comments0users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(userNumbers0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statsData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statsData.getUsersNumber());
        Assert.assertEquals(1000, statsData.getPostsNumber());
        Assert.assertEquals(0, statsData.getCommentsNumber());
        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerPost(),1e-8);
    }

    @Test
    public void test1000comments0users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);
        List<String> userNumbers0 = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(userNumbers0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        //When
        statsData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statsData.getUsersNumber());
        Assert.assertEquals(1000, statsData.getPostsNumber());
        Assert.assertEquals(1000, statsData.getCommentsNumber());
        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(1, statsData.getCommentsAveragePerPost(),1e-8);
    }

    @Test
    public void moreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);

        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>());
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        statsData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statsData.getUsersNumber());
        Assert.assertEquals(10, statsData.getPostsNumber());
        Assert.assertEquals(100, statsData.getCommentsNumber());
        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(10, statsData.getCommentsAveragePerPost(),1e-8);
    }

    @Test
    public void lessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsData statsData = new StatsData(statisticsMock);

        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>());
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        statsData.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statsData.getUsersNumber());
        Assert.assertEquals(100, statsData.getPostsNumber());
        Assert.assertEquals(10, statsData.getCommentsNumber());
        Assert.assertEquals(0, statsData.getPostsAveragePerUser(),1e-8);
        Assert.assertEquals(0, statsData.getCommentsAveragePerUser(),1e-8);
        Assert.assertEquals(0.1, statsData.getCommentsAveragePerPost(),1e-8);
    }
}