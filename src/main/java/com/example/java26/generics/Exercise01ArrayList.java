package com.example.java26.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise01ArrayList {
    static void main() {
        List<String> strings = new ArrayList<>();

        strings.add("Apple");
        strings.add("Banana");

        String firstFruit = strings.get(0);

        strings.set(1, "Orange");

        strings.remove(0);

        boolean empty = strings.isEmpty();

        int size = strings.size();

        boolean containsOrange = strings.contains("Orange");

        strings.add("Apple");
        strings.add("Watermelon");
        strings.add("Pear");

        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        };

        strings.sort(lengthComparator);

        IO.println(strings);

    }
}
