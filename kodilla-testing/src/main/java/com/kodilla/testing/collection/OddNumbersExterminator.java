package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i=0; i<numbers.size(); i++) {
            int n = numbers.get(i);
            if (n % 2 == 0) {
                even.add(n);
            }
        }
        return even;
    }
}
