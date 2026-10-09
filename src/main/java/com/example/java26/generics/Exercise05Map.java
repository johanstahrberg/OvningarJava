package com.example.java26.generics;
import java.util.HashMap;
import java.util.Map;

public class Exercise05Map {

    static void main() {

        String result = getCapital("Sweden");

        IO.println(result);

    }


    private static Map<String, String> capitals = new HashMap<>();

    static {
        capitals.put("Sweden", "Stockholm");
        capitals.put("Norway", "Oslo");
        capitals.put("France", "Paris");
    }


    public static String getCapital(String country) {

        return capitals.get(country);
    }



}
