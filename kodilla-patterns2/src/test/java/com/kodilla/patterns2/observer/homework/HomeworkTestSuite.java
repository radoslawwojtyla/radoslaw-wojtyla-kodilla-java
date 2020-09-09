package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Adam");
        Mentor mentor2 = new Mentor("Tomek");

        StudentTask student1 = new StudentTask("Anna");
        StudentTask student2 = new StudentTask("Filip");
        StudentTask student3 = new StudentTask("Monika");

        student1.registerObserverH(mentor1);
        student2.registerObserverH(mentor1);
        student3.registerObserverH(mentor2);

        //When
        student1.addTask("Observer Pattern");
        student1.addTask("Builder Pattern");
        student1.addTask("Rest API");
        student2.addTask("Singleton Pattern");
        student2.addTask("Builder Pattern");
        student3.addTask("Decorator pattern");

        //Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}
