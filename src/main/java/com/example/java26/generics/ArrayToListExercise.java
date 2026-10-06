package com.example.java26.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayToListExercise {

    static void main() {

        String[] fruits = {"Apple", "Pear", "Orange"};

        List<String> result = arrayToList(fruits);

        IO.println(result);

    }

    public static List<String> arrayToList(String[] values) {
        List<String> list = new ArrayList<>();

        for (String value : values) {
            list.add(value);
        }

        return list;
    }
}