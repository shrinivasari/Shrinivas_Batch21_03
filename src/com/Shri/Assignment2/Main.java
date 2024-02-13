package com.Shri.Assignment2;

import java.util.Scanner;

class SentenceChecker {
    private String sentence;

    public SentenceChecker(String sentence) {
        this.sentence = sentence;
    }

    public void checkWord(String word) {
        if (sentence.contains(word)) {
            System.out.println(word + " is present in the sentence");
        } else {
            System.out.println(word + " is not present in the sentence");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word");
        String word = scanner.nextLine();

        SentenceChecker sentenceChecker = new SentenceChecker(sentence);
        sentenceChecker.checkWord(word);

        scanner.close();
    }
}