package com.Ashutosh;

import java.util.Arrays;
public class Varargs {
    public static void main(String[] args){
        //fun(14,34,546,453,45,67,8768,23424,34535,23,545,565);
        //multiple(5,7,"6,74564,5,56,7565,565,565");
        demo("alex, hi how are you?, bye, tata, khatam, gaya ");
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));

    }
    // same name but different arguments
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    // always pass the varargs at the end
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
