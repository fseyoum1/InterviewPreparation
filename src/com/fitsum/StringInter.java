package com.fitsum;

import java.util.List;

public class StringInter {

    public static void main(String[] args) {

        String str = "ARADHAYA'S BRILLIANCE CENTER";
        String val = "984hh";
        countVowels(str);

        stringCharater(val);

    }

    public static void countVowels(String str) {

        char[] arr = str.toCharArray();


        int countVowels = 0;
        int countConsenante = 0;
        int countNonletter = 0;

        List<Character> elements = new java.util.ArrayList<Character>();
        elements.add('A');
        elements.add('O');
        elements.add('U');
        elements.add('I');
        elements.add('E');
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                if (elements.contains(arr[i])) {
                    countVowels++;
                } else {
                    countConsenante++;
                }

            } else {
                countNonletter++;
            }
        }

        System.out.println("vowels " + countVowels);
        System.out.println("consenante " + countConsenante);
        System.out.println("non-letter " + countNonletter);


    }

    /*checks if the string contains numbers

     */
    public static void stringInteger(String str) {

        int i = 0;
        int len = str.length();
        while (i != len) {
            if(str.charAt(i) >= 0 && str.charAt(i) <= 9) {
                i++;
            } else {
                System.out.println("Not a number");
            }
            if(i == len) {
                System.out.println("All Numbers");
            }
        }

    }


    public static void stringCharater(String str) {
        char[] arr = str.toCharArray();

        for(int i = 0; i < str.length(); i++) {
            if(arr[i] >= '0' && arr[i] <= '9') {
                System.out.println("Comparing numbers as a character");
            }
        }
    }
}
