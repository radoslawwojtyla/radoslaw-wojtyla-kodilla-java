package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.*;

public class OddNumbersExterminator {
    private ArrayList<Integer> numbers;
    ArrayList<Integer> even = new ArrayList<>();

    public void exterminate(ArrayList<Integer> numbers) {
        for (int i=0; i<numbers.size(); i++) {
            int n = numbers.get(i);
            if (n % 2 == 0) {
                even.add(n);
            }
        }
        System.out.println(even);
    }

    public ArrayList<Integer> getEven() {
        return even;
    }
}
