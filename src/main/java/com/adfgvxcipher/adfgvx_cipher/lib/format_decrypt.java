package com.adfgvxcipher.adfgvx_cipher.lib;

public class format_decrypt {

    public String format_adfgx(String inputString, String language) {
        inputString = inputString.toUpperCase();
        inputString = stringFunctions.normalizer(inputString);
        inputString = stringFunctions.returnOnlyLetters(inputString);

        //Change letters based on alphabet language
        if (language.equals("EN")) {
            inputString = inputString.replaceAll("J","I");
        } else {
            inputString = inputString.replaceAll("W","V");
        }

        return inputString;
    }

    public String format_adfgvx(String inputString) {
        inputString = inputString.toUpperCase();
        inputString = stringFunctions.normalizer(inputString);
        inputString = stringFunctions.returnOnlyLettersAndNumbers(inputString);
        return inputString;
    }

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

    public String format_adfgx_output(String inputString) {
        for (String[] number : numbers) inputString = inputString.replaceAll(number[1], number[0]);
        inputString = inputString.replaceAll("MEDZERA", " ");
        return inputString;
    }

    public String format_adfgvx_output(String inputString) {
        inputString = inputString.replaceAll("MEDZERA", " ");
        return inputString;
    }
}
