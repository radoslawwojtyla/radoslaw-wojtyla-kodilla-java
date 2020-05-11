package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals(painting.isTaskExecuted(), true);
        Assert.assertEquals(painting.getTaskName(), "Refresh dining room");
    }

    @Test
    public void testTaskFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals(driving.isTaskExecuted(), true);
        Assert.assertEquals(driving.getTaskName(), "Praying");
    }

    @Test
    public void testTaskFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals(shopping.isTaskExecuted(), true);
        Assert.assertEquals(shopping.getTaskName(), "Present for mommy");
    }
}