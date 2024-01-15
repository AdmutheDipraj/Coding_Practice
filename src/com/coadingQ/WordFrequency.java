package com.coadingQ;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph This paragraph contains sample text Text is important for testing";
        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split(" ");

        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
