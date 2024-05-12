package org.example.homework11;

import java.util.HashMap;
import java.util.Map;

public class CollectionsOfSymbols {
    public Map<String, Integer> mapSymbols(String sentence) {
        Map<String, Integer> lettersCount = new HashMap<>();
        char[] symbolsArray = sentence.toCharArray();
        for (char symbol : symbolsArray) {
            if (!Character.isLetter(symbol)) {
                continue;
            }
           lettersCount.merge(String.valueOf(symbol), 1, Integer::sum);
        }
        return lettersCount;
    }
}