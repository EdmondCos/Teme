package com.sda.collections;

import java.util.LinkedList;
import java.util.List;

public class TemaLinkedList {
    public static void main(String[] args) {
        runnableInTemaMaps();
    }

    public static void runnableInTemaMaps() {
        String modifiedText = TextTema.cleanUpText();
        String[] textSplit = modifiedText.split(" ");

        List<String> dictionary = new LinkedList<>();
        List<String> counter = new LinkedList<>();

        int x;
        for (int i = 0; i < textSplit.length; i++) {
            if (dictionary.contains(textSplit[i])) {
                String temp = counter.get(dictionary.indexOf(textSplit[i]));
                x = Integer.valueOf(temp.substring(temp.indexOf("=") + 1));
                x++;
                counter.set(dictionary.indexOf(textSplit[i]), textSplit[i] + "=" + x);
            } else {
                dictionary.add(textSplit[i]);
                counter.add(textSplit[i] + "=" + 1);
            }
        }

        System.out.println(counter);
    }

}
