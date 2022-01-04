package com.Ashutosh;

public class Shadowing {
    static int x = 90; // will be shadowed

    public static void main(String[] args) {
        System.out.println(x);//90
        int x = 40; // we reinitialized the x
        //but if we just do x = 40 we refer the local variable where x=90
        //if x = 40 than the fun() will take 40 as argument.
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
