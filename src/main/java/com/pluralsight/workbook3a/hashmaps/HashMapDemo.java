package com.pluralsight.workbook3a.hashmaps;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        // Workbook 3a pp. 53-54: a HashMap stores key/value pairs
        // the key is a state (String), the value is its capital (String)
        HashMap<String, String> statesAndCapitals = new HashMap<>();
        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");
        System.out.println(statesAndCapitals);

        // TODO: p. 55: look up the capital of TX with get

        // p. 56: a key that isn't there gives back null
        String capital = statesAndCapitals.get("OK");
        System.out.println(capital);
    }
}
