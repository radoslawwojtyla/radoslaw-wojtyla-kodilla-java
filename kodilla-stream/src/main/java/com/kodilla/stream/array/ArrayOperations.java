package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        double average = IntStream.range(0, numbers.length)
                .map(n -> {
                    System.out.println(numbers[n]);
                    return numbers[n];
                })
                .average()
                .getAsDouble();
        System.out.println(average);
        return average;
    }
}
