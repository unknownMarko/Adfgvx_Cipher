package com.adfgvxcipher.adfgvx_cipher.lib;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;

public class stringFunctions {

    //Finds if String has duplicate chars
    public static boolean hasDuplicate(String inputString) {
        char[] chars = inputString.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String removeDuplicates(String input) {
        LinkedHashSet<Object> uniqueChars = new LinkedHashSet<>();

        // Iterate through each character and add it to the set
        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        // Rebuild the string without duplicates
        StringBuilder result = new StringBuilder();
        for (Object c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }

    //Adds spacing into String
    public static String spacing(String inputString, int spacing) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (i % spacing == 0 && i > 0) output.append(" ");
            output.append(inputString.charAt(i));
        }
        return output.toString();
    }

    //Normalize text. For example from č -> C
    public static String normalizer(String inputString) {
        inputString = inputString.toUpperCase();

        inputString = Normalizer.normalize(inputString, Normalizer.Form.NFD);
        inputString = Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(inputString).replaceAll("");

        //Returns only letters
        //inputString = inputString.replaceAll("[^A-Z]", "");

        return inputString;
    }

    //Kinda self-explanatory
    public static String returnOnlyLetters(String inputString) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);

            if (character >= 'A' && character <= 'Z') {
                output.append(character);
            }
        }

        return output.toString();
    }

    public static String returnOnlyLettersAndNumbers(String inputString) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);

            if ((character >= 'A' && character <= 'Z') || (character >= '0' && character <= '9') ) {
                output.append(character);
            }
        }

        return output.toString();
    }

    public static String returnOnlyLettersNumbersUnderscore(String inputString) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);

            if ((character >= 'A' && character <= 'Z') || (character >= '0' && character <= '9') || character == '_') {
                output.append(character);
            }
        }

        return output.toString();
    }

    public static String returnOnlyLettersUnderscore(String inputString) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);

            if ((character >= 'A' && character <= 'Z') || character == '_') {
                output.append(character);
            }
        }

        return output.toString();
    }

    //Kinda self-explanatory
    public static String shuffleString(String input) {
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) characters.add(c);

        Collections.shuffle(characters);

        StringBuilder output = new StringBuilder();
        for (char c : characters) output.append(c);

        return output.toString();
    }

    public static char[][] stringToCharArray(String input, int columnSize, int rowSize) {

        char[][] array = new char[rowSize][columnSize];

        for (int i = 0; i < rowSize * columnSize; i++) {
            //[Row], [Column]
            if (i < input.length()) {
                array[i / columnSize][i % columnSize] = input.charAt(i);
            } else {
                array[i / columnSize][i % columnSize] = '_';
            }
        }
        return array;
    }
}
