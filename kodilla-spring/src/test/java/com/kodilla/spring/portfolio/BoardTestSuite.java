package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        List<String> sampleToDoList = board.getToDoList().taskAdd("Kodilla exercise 14.4");
        List<String> sampleInProgressList = board.getInProgressList().taskAdd("Kodilla exercise 14.3");
        List<String> sampleDoneList = board.getDoneList().taskAdd("Kodilla exercise 14.2");
        //Then
        Assert.assertEquals(sampleDoneList.get(0), "Kodilla exercise 14.2");
        Assert.assertEquals(sampleInProgressList.get(0), "Kodilla exercise 14.3");
        Assert.assertEquals(sampleToDoList.get(0), "Kodilla exercise 14.4");
    }
}
