package com.kodilla.stream.array;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(System.out::print);

        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
    }
}
