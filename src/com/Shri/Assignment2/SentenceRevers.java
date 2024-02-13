package com.Shri.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

class AlphabeticalSorter {
    private String sentence;

    public AlphabeticalSorter(String sentence) {
        this.sentence = sentence;
    }

    public void arrangeLetters() {
        if (sentence.matches("[a-z ]+")) {
            String[] words = sentence.split("\\s+");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                char[] letters = word.toCharArray();
                Arrays.sort(letters);
                result.append(new String(letters)).append(" ");
            }

            System.out.println(result.toString().trim());
        } else {
            System.out.println(sentence + " is an invalid input");
        }
    }
}

public class SentenceRevers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        AlphabeticalSorter sorter = new AlphabeticalSorter(sentence);
        sorter.arrangeLetters();

        scanner.close();
    }
}