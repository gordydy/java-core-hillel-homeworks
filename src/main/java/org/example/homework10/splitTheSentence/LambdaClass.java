package org.example.homework10.splitTheSentence;

import java.util.List;

public class LambdaClass {
    public static void splitAndPrint(String sentence) {
        List.of(sentence.split(" ")).forEach(word -> System.out.println(word));
    }
}