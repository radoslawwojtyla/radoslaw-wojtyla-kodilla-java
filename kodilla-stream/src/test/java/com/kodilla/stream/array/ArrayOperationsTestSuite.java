package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = i+1;
        }
        double averageExpected = 10.5;
        //When
        double average = ArrayOperations.getAverage(numbers);
        // Then
        Assert.assertEquals(averageExpected, average, 0.001);
    }
}
