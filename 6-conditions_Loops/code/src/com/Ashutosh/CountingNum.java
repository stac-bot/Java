package com.Ashutosh;

public class CountingNum {
    public static void main(String[] args) {

        // for counting the number of digits in given number
        /*
        int n = 45333245;

        int count = 0;
        while(n>0){
            n =  n/10;
            count +=1;
        }
        System.out.println(count);
        */

        // for counting the number of times particular digit occurs in a given number

        int n = 44565565;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
}
