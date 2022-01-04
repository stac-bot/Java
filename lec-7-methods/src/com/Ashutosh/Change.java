package com.Ashutosh;

import java.util.Arrays;
public class Change {
    public static void main(String[] args) {
        //create an array
        int [] arr = {2,45,65,67,435};
        change(arr);// here arr is refered as array argument
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;// if you make change to the object via reference variable
        // the object value changes for all
    }
}
