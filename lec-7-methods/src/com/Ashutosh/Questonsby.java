package com.Ashutosh;
import java.util.Scanner;
public class Questonsby {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);

        //function to calculate 3 digits armstrong number
        for (int i = 100; i <= 100; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }

        }
    }

    //Armstrong
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }

    //function isprime
    static boolean isprime(int n) {
        if (n == 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}


