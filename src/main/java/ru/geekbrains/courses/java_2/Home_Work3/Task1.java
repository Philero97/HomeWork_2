package ru.geekbrains.courses.java_2.Home_Work3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    public static final String [] INPUT_DATA = {
            "Rome",
            "Boost",
            "Cake","Cake","Cake",
            "Doom","Doom",
            "Elf",
            "Faith",
            "Game","Game",
            "Hero",
            "Grace",
            "Illumian",
    };

    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new LinkedHashMap<>();
        for (String word : INPUT_DATA) {
            Integer frequency = frequencyByWord.get(word);
            if (frequency == null){
                frequency = 0;
            }
            frequencyByWord.put(word, ++frequency);
        }
        for (String word : frequencyByWord.keySet()){
            Integer frequency = frequencyByWord.get(word);
            System.out.println(word + ": " + frequency);
        }
    }

}
