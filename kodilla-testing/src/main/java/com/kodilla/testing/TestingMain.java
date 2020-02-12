package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if (result.equals("theForumUser")){
//            System.out.println("test OK");
//        } else {
//            System.out.println("Error!");
//        }
        int a = 5;
        int b = 3;

        Calculator calculator = new Calculator();
        int result1 = calculator.add(a, b);
        int result2 = calculator.substract(a, b);

        if (result1 == (5 + 3)) {
            System.out.println("Metoda add działa poprawnie");
        } else {
            System.out.println("Metoda add działa błędnie");
        }

        if (result2 == (5 - 3)) {
            System.out.println("Metoda substract działa poprawnie");
        } else {
            System.out.println("Metoda substract działa błędnie");
        }
    }
}

