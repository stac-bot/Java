package com.Ashutosh;

import java.util.Scanner;

public class Reverse {
    public static void main(String [] args){

        // take input from the user
        Scanner in = new Scanner(System.in);
        int num =  in.nextInt();
        int ans = 0;

        while(num>0) {
            // create a temporary variable so we can store the last digit
            // dividing by % will give te last digit
            int rem = num % 10;
            // divde the number by 10 gives you the all digits but rem
            num /= 10;
            // ans store reverse order
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
