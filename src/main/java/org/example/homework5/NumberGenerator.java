package org.example.homework5;

import java.util.Random;

public class NumberGenerator {
    public void generateAndPrint() {
        Random random = new Random();
        boolean[] isGenerated = new boolean[101];
        int sum = 0;
        int count = 0;
        int num;

        while (true) {
            num = random.nextInt(100) + 1;

            if (isGenerated[num]) {
                System.out.println("Number " + num + " is duplicated!");
                break;
            } else {
                isGenerated[num] = true;
                System.out.println("Generated number: " + num);
                sum += num;
                count++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
    }
}