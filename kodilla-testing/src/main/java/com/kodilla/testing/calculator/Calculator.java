package com.kodilla.testing.calculator;

public class Calculator<substractResult> {
    private int a;
    private int b;
    public int addResult;
    public int substractResult;

    public int add(int a, int b) {
        return addResult = a+b;
    }

    public int substract(int a, int b) {
        return substractResult = a-b;
    }
}
