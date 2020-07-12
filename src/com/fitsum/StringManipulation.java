package com.fitsum;

public class StringManipulation {

    public static void main(String[] args) {
        String test = "Hel";

        String tobeCopied = "Hi there you are--> ";
        copyString(tobeCopied);


        System.out.print("Reversed String is--> ");
        reverse(test);
        //System.out.printf("%d", lengthString(test));
        String str = "too hot to HOOT";
        System.out.println(str +" is palindrome " +isPalindrom(str));

        String strToUppercase = "apple";
        System.out.println(toUppercase(strToUppercase));

        toUpperChar(strToUppercase);

    }

    public static void reverse(String ele) {
        /*
        char[] eleChar = ele.toCharArray();
       // System.out.println(eleChar[0]);
        //char[] output = new char[ele.length()];
        String outPut = "";
        for (int i = 0; i < eleChar.length; i++) {
            //outPut =  outPut + eleChar[ele.length() - 1 - i];
            outPut = outPut + ele.charAt(ele.length()-1-i);
        }
        return outPut;
         */

        char[] oriStr = ele.toCharArray();

        char[] reveseArr = new char[ele.length()];
        int pointer = 0;
        int eleSize = ele.length();
        while(pointer != eleSize) { // hel
            //reveseArr[pointer] = ele.charAt(eleSize-1 - pointer);
            reveseArr[pointer] = oriStr[eleSize - 1 - pointer];
            pointer++;
        }
        System.out.println(reveseArr);

    }
    /*
    * Computing the length of the string
    *
    */

    public static int lengthString(String str) {

        //add the value of null to end of the string
        //you can do this by concatenating of a '\0'-end of character
        str = str.concat("\0");
        int count = 0;
        int index = 0;
        while(str.charAt(index) != '\0') { //
            count++; //1,2,3
            index++; //1,2,3
        }
        return count;
    }


    /*
    Copying one string into another
     */
    public static void copyString(String str) {

        char[] arrChar = str.toCharArray();
        char[] outP = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
             outP[i] = arrChar[i];
        }

        System.out.println(outP);


    }

    public static boolean isPalindrom(String str) {

        //    RADDAR
        int pointer = str.length();
        int index = 0 ;
        int firstIndex = 0;


        // use replace method to remove spaces between characters
        str = str.replace(" ", "").toLowerCase();
        int lastIndex = str.length() - 1;

        System.out.println("space removed " + str);


        //while(firstIndex != pointer/2) {
        while(firstIndex < lastIndex) {
//            if(str.charAt(firstIndex) == ' ' && str.charAt(lastIndex) != ' ') {
//                firstIndex++;
//            } else if(str.charAt(lastIndex) == ' ' && str.charAt(firstIndex) != ' ') {
//                lastIndex--;
//            }

            if ( str.charAt(firstIndex) != str.charAt(lastIndex)) {

                return false;
            }

            firstIndex++;
            lastIndex--;

        }
        return true;

    }


    // changing Strings to uppercase
    public static String toUppercase(String str) {

        String upper = "";

        //System.out.println((char)('B' + 32) );

        for (int i = 0; i < str.length(); i++) {

            int valueOne = (int)(str.charAt(i));
            //int valueTwo = (int)(str.charAt(i));

           if (valueOne >= 97 && (valueOne <= 122)) {
                // small
                char outPut = (char) (valueOne - 32);

                upper = upper + outPut;
            } else {
                upper = upper + (char)valueOne;
            }

        }


        return upper;
    }

    public static void toUpperChar(String str) {

        char[] toUpper = str.toCharArray();
        char[] outPut = new char[toUpper.length];
        int i = 0;

        while(i < toUpper.length) {

            int var = (int)str.charAt(i);
            if(var <= 90 && var >= 65) {

                outPut[i] = (char)(var);

            } else if(var <= 122 && var >= 97) {

                outPut[i] = (char)(var - 32);

            } else {
                outPut[i] = toUpper[i];
            }
            i++;
        }
        System.out.println(outPut);

    }


}
