package com.Ashutosh;

import java.util.Scanner;
public class SUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextInt();
//        System.out.println();
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("Sum of your given input is : " + sum);
    }
}
