package com.example.java26.generics;

import java.util.ArrayList;
import java.util.List;

public class Exercise02And03 {

    static void main() {

        String[] fruits = {"Apple", "Pear", "Orange"};

        List<String> result = arrayToList(fruits);

        List<String> reversedResult = reverseList(result);

        IO.println(reversedResult);

        IO.println(result);

    }

    public static List<String> arrayToList(String[] values) {
        List<String> list = new ArrayList<>();

        for (String value : values) {
            list.add(value);
        }

        return list;
    }

    public static List<String> reverseList(List<String> list) {
        List<String> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));

        }

        return reversed;

    }


}