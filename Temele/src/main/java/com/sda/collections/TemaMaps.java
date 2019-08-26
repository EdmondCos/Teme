package com.sda.collections;

import java.util.HashMap;
import java.util.Map;

public class TemaMaps {
    public static void main(String[] args) {
        String modifiedText = TextTema.cleanUpText();
        String[] textSplit = modifiedText.split(" ");

        Map<String, Integer> dictionary = new HashMap<>();

        for (String i : textSplit) {
            if (dictionary.containsKey(i)) {
                dictionary.put(i, dictionary.get(i) + 1);
            } else {
                dictionary.put(i, 1);
            }
        }

//        TemaLinkedList.runnableInTemaMaps();
        System.out.print(dictionary.entrySet());
    }

}
