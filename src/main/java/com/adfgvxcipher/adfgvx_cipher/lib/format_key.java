package com.adfgvxcipher.adfgvx_cipher.lib;

import java.util.*;

public class format_key {

    //TODO Refactor in future?
    public String format(String inputString) {
        // To Upper Letters
        inputString = inputString.toUpperCase();

        // Normalizer
        inputString = stringFunctions.normalizer(inputString);

        // Filter only letters
        inputString = stringFunctions.returnOnlyLetters(inputString);

        return inputString;
    }

    public static ArrayList<Object[]> keyToArray(String formattedKey) {
        ArrayList<Object[]> result = new ArrayList<>();

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : formattedKey.toCharArray()) {
            int count = charCountMap.getOrDefault(ch, 0);
            result.add(new Object[]{ch, count});
            charCountMap.put(ch, count + 1);
        }
        return result;
    }

    public static ArrayList<Object[]> sortArrayList(ArrayList<Object[]> input) {
        //TODO new Comparator<Object[]>() Preco by to bez tohoto neslo? Najst lepsie riesenie?
        Collections.sort(input, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] firstObject, Object[] secondObject) {
                int charCompare = ((Character) firstObject[0]).compareTo((Character) secondObject[0]);
                if (charCompare != 0) return charCompare;
                return ((Integer) firstObject[1]).compareTo((Integer) secondObject[1]);
            }
        });
        return input;
    }

    public static ArrayList<Object[]> sortArrayListByWord(ArrayList<Object[]> input, String key) {
        //Ulozenie povodne pozicie
        final Map<Character, List<Integer>> positionMap = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            positionMap.computeIfAbsent(c, k -> new ArrayList<>()).add(i);
        }
        //Zoradenie
        Collections.sort(input, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] firstObject, Object[] secondObject) {
                char char1 = (char) firstObject[0];
                char char2 = (char) secondObject[0];
                int count1 = (int) firstObject[1];
                int count2 = (int) secondObject[1];

                List<Integer> positions1 = positionMap.get(char1);
                List<Integer> positions2 = positionMap.get(char2);

                int pos1 = positions1.get(count1);
                int pos2 = positions2.get(count2);

                return Integer.compare(pos1, pos2);
            }
        });
        return input;
    }

    public static String encrypt(ArrayList<Object[]> input) {
        StringBuilder output = new StringBuilder();

        for (Object[] entry : input) {
            output.append(entry[2]);
        }
        return output.toString();
    }

    public static String decrypt(ArrayList<Object[]> input) {
        StringBuilder result = new StringBuilder();

        int maxLength = 0;
        for (Object[] obj : input) {
            String text = (String) obj[2];
            maxLength = Math.max(maxLength, text.length());
        }

        for (int i = 0; i < maxLength; i++) {
            for (Object[] obj : input) {
                String text = (String) obj[2];
                if (i < text.length()) {
                    result.append(text.charAt(i));
                }
            }
        }
        return result.toString();
    }
}
