package com.adfgvxcipher.adfgvx_cipher.lib;

public class format_encrypt {

    static String[][] numbers = {
            {"0", "XNULAX"},
            {"1", "XONEX"},
            {"2", "XDVAX"},
            {"3", "XTRIX"},
            {"4", "XSTYRIX"},
            {"5", "XPATX"},
            {"6", "XSESTX"},
            {"7", "XSEDEMX"},
            {"8", "XOSEMX"},
            {"9", "XDEVATX"},
    };

    public String format_adfgx(String inputString, String language) {
        // To Upper Letters
        inputString = inputString.toUpperCase();

        // Normalizer
        inputString = stringFunctions.normalizer(inputString);

        // Changing Numbers and spaces to letters
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);

            for (String[] number : numbers) {
                if (String.valueOf(character).equals(number[0])) {
                    output.append(number[1]);
                    break;
                }
            }

            if (character == ' ') output.append("MEDZERA");

            output.append(character);
        }

        // Filter and return only letters
        inputString = stringFunctions.returnOnlyLetters(output.toString());

        //Change letters based on alphabet language
        if (language.equals("EN")) {
            inputString = inputString.replaceAll("J","I");
        } else {
            inputString = inputString.replaceAll("W","V");
        }

        return inputString;
    }

    public String format_adfgvx(String inputString) {
        // To Upper Letters
        inputString = inputString.toUpperCase();

        // Normalizer
        inputString = stringFunctions.normalizer(inputString);

        //Convert space to letters
        inputString = inputString.replaceAll(" ", "MEDZERA");

        inputString = stringFunctions.returnOnlyLettersAndNumbers(inputString);

        return inputString;
    }
}
