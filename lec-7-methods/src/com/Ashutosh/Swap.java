package com.Ashutosh;

import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        // swap numbers code
        System.out.println(a+" "+ b);
        //int temp = a;
        //a = b;
        //b = temp;
        swap(a,b);
        //System.out.println(a+" "+b);
        String name ="Ashu Rudra";
        changename(name);
        System.out.println(name);
    }
    static void changename(String naam){
        naam = "Tom hardy";// creating a new object
        System.out.println(naam);

    }
    static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println(n1+" "+n2);
    }
}
