package com.idatco.assessment.sorting;

public class LetterSorter {

    public static String sortLetters(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Counting occurrences of each letter (a-z)
        int[] letterCount = new int[26];
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lowerCase = Character.toLowerCase(ch);
                letterCount[lowerCase - 'a']++;
            }
        }

        // Building the sorted string
        StringBuilder result = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            result.append(String.valueOf(ch).repeat(letterCount[ch - 'a']));
        }

        return result.toString();
    }
}
