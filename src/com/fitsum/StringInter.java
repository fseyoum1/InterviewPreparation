package com.fitsum;

import java.util.*;

public class StringInter {

    public static void main(String[] args) {

//        String str = "ARADHAYA'S BRILLIANCE CENTER";
//        String val = "984hh";
//        countVowels(str);
//        stringCharater(val);

        String[] a1 = new String[3];
        String[] a2 = new String[3];
        a1[0] = "Tomi";
        a1[1] = "Kale";
        a1[2] = "Sam";
        a2[0] = "Sam";
        a2[1] = "Kale";
        a2[2] = "Dave";

       String[] output = removeDuplicate(a1, a2);
        for (int i = 0; i < output.length; i++) {

            System.out.print( output[i] + " ");

        }


        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }





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

    public static String[] removeDuplicate(String[] arr1, String[] arr2) {

        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        String[] conArr = new String[arr1Len + arr2Len];

        System.arraycopy(arr1, 0, conArr, 0, arr1Len);
        System.arraycopy(arr2, 0, conArr, arr1Len, arr2Len);

//        for (int i = 0; i < conArr.length; i++) {
//            System.out.print(conArr[i] + " ");
//        }
        Set<String> mySet = new HashSet<>();
        for (int i = 0; i < conArr.length; i++) {
            mySet.add(conArr[i]);
        }
        Iterator<String> iter = mySet.iterator();
        while(iter.hasNext()) {
            String setEle = iter.next();
            //System.out.print(setEle + " ");
        }
        int size = mySet.size();
        String[] ou = new String[size];
        int i = 0;
        for(String val: mySet) {
            ou[i] = val;
            i++;
        }
        return ou;
    }
    /*
    
    find the sum between two elements and return if the 
    sum equals the "sum" given in the array and display the index of the first elements
    which match when added to the sum given. You must return the result as an array, be efficent 
     */
    public static int[] findTwoSum(int[] list1, int sum) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {

            int value = sum - list1[i];
            if (value == list1[i]) {
                if (myMap.get(value) != null) {
                    return new int[]{i, myMap.get(value)};
                }

                myMap.put(list1[i], i);

            }
            
        }

        return null;
        
    }



}
