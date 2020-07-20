package com.run;

public class Run {
    static int k;
    public static void main(String[] args) {

        System.out.println(fib(10));
        String ch = "Hello";
        System.out.println(isUsingUniqueChars(ch));

    }

    static int fib(int n) {


        if (n <= 0) {
           // System.out.println(k++);
            return 0;
        } else if (n == 1) {
           // System.out.println(k++);
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);

        }


    }

    public static boolean isUsingUniqueChars(String str) {

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (ch == str.charAt(j)) {
                    return false;

                }
                
            }

        }

        return true;
    }
}
