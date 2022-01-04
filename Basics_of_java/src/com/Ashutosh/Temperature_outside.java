package com.Ashutosh;

import java.util.Scanner;

public class Temperature_outside {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("please enter the temperature in c:  ");
        float tempC = temp.nextFloat();
        float tempF =(tempC *  9/5) + 32;
        System.out.println(tempF);

        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();



    }
}
