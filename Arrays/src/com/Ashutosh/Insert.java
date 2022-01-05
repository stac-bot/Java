package com.Ashutosh;

import java.util.Arrays;
import java.util.Scanner;
public class Insert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 2;
        //[0,1,2]
        //System.out.println(arr[1]);

        // input using for loops
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//
//        }
//        //output the array in row
//        //System.out.println(Arrays.toString(arr));
//
//        //output in colum form
//        for (int num : arr){
//            System.out.println(num + " ");
//        }
        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // output: [ashu, avinash, prajwal, abhi]

        //modify the input in the array
        str[1] = "kunal";
        System.out.println("modified array:");
        System.out.println(Arrays.toString(str));

    }
}
