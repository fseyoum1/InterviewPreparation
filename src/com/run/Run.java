package com.run;

public class Run {
    static int k;
    public static void main(String[] args) {

        System.out.println(fib(3));

    }

    static int fib(int n) {


        if (n <= 0) {
            System.out.println(k++);
            return 0;
        } else if (n == 1) {
            System.out.println(k++);
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }

}
