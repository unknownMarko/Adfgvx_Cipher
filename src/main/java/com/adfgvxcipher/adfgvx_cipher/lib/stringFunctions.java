package com.adfgvxcipher.adfgvx_cipher.lib;

import java.text.Normalizer;
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

    //Adds spacing into String
    public static String spacing(String inputString, int spacing) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            if (i % spacing == 0 && i > 0) output.append(" ");
            output.append(inputString.charAt(i));
        }
        return output.toString();
    }

    //Normalize text. For example from č -> C and returns only upperLetters
    public static String normalizer(String inputString) {
        inputString = inputString.toUpperCase();

        inputString = Normalizer.normalize(inputString, Normalizer.Form.NFD);
        inputString = Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(inputString).replaceAll("");

        //Returns only letters
        inputString = inputString.replaceAll("[^A-Z]", "");

        return inputString;
    }
}
