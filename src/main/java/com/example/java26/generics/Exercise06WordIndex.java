package com.example.java26.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise06WordIndex {
    static void main() {

        List<String> strings = new ArrayList<>();

        strings.add("apple pear");
        strings.add("banana apple");
        strings.add("pear apple");

        Map<String, List<Integer>> result = findWordIndexes(strings);

        IO.println(result);

    }

    public static Map<String, List<Integer>> findWordIndexes(List<String> sentences) {
        Map<String, List<Integer>> wordIndexes = new HashMap<>();

        for (int i = 0; i < sentences.size(); i++) {
            String[] words = sentences.get(i).split(" ");

            for (String word : words) {
                if (!wordIndexes.containsKey(word)) {
                    wordIndexes.put(word, new ArrayList<>());
                }

                wordIndexes.get(word).add(i);
            }
        }

        return wordIndexes;
    }



}
