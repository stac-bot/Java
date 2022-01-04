package com.Ashutosh;
import java.util.Scanner;
public class StringExample {
    public static void main(String[] args){
        String message = greet();
        System.out.println(message);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String person = mygreet(naam);
        System.out.println("howard stark is nice to meet you:" + person);
    }
    static String mygreet(String name){
        String msg = name;
        return msg;
    }
    static String greet(){
        String name = "howard stark!";
        return name;
    }
}
