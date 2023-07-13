package com.example.wordthirdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class WordThirdProjectApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word: ");
            String input = scanner.nextLine();

            StringBuilder firstLetters = new StringBuilder();

            String[] words = input.split("\\s+");

            boolean ignoreInput = false;

            for (String word : words) {
                if (!word.isEmpty()) {
                    char firstChar = word.charAt(0);
                    if (Character.isLetter(firstChar)) {
                        char firstLetter = Character.toUpperCase(firstChar);
                        firstLetters.append(firstLetter);
                    } else if (Character.isDigit(firstChar)) {
                        ignoreInput = true;
                        break;
                    }
                }
            }

            if (!ignoreInput) {
                if (firstLetters.length() > 0) {
                    System.out.println("First letters: " + firstLetters.toString());
                } else {
                    System.out.println("lütfen kelime girin");
                }
            }}
    }

}
