package com.example.java26.generics;

import java.util.HashSet;
import java.util.Set;

public class Exercise04Set {
    static void main() {
        String text = "apple pear apple orange pear";
        Set<String> result = uniqueWords(text);
        IO.println(result);
    }
    public static Set<String> uniqueWords(String text) {
        Set<String> words = new HashSet<>();
        String[] splitWords = text.split(" ");
        for (String word : splitWords) {
            words.add(word);

        }

        return words;

    }




}
