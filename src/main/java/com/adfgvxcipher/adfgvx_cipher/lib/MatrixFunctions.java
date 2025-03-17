package com.adfgvxcipher.adfgvx_cipher.lib;

public class MatrixFunctions {

    public static String alphabetEnglish = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
    public static String alphabetCzech =   "ABCDEFGHIJKLMNOPQRSTUVXYZ";
    public static String alphabetADFGVX =   "ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789";

    public static String checkMissingLetters(String language, String input) {
        String alphabet = "";
        switch (language) {
            case "EN" -> alphabet = alphabetEnglish;
            case "CZ" -> alphabet = alphabetCzech;
            case "ADFGVX" -> alphabet = alphabetADFGVX;
        }

        for (int i = 0; i < input.length(); i++) {
            alphabet = alphabet.replaceAll(String.valueOf(input.charAt(i)), "");
        }
        return alphabet;
    }

    public static String adfgxGenerateMatrix(String language) {
        String alphabet;
        String output;

        if (language.equals("EN")) {
            alphabet = alphabetEnglish;
        } else {
            alphabet = alphabetCzech;
        }

        output = stringFunctions.shuffleString(alphabet);

        return output;
    }

    public static String adfgvxGenerateMatrix() {
        String output = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        output = stringFunctions.shuffleString(output);

        return output;
    }

    //Finds position of char in matrix.
    //Returns X and Y indexes
    public static int[] matrixGetCharLocation(char target, String matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int index = i * size + j;
                if (index < matrix.length() && target == matrix.charAt(index)) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static char matrixGetCharFromLocation(int[] coordinates, String matrix, int size) {
        return matrix.charAt(coordinates[0] * size + coordinates[1]);
    }
}
