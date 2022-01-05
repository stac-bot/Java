package com.Ashutosh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // syntax
        // datatype[] variable_name = new datatype[size];
        String name = "William";

        // list of roll numbers

        //int[] roll;// declaration of the array the new variable is created in the  stack memory
        //roll = new int[5];//intialisation actually here the object is created in the heap  memory
        // int roll1 = 2;
        // int roll2 = 4;
        // int roll3 = 7;
        // int roll4 = 5;
        // doing directly
        //int[] roll = {2,3,5,6,7};
        //System.out.println(roll[1]);

        // string array
        String[] arr = new String[4];
        System.out.println(arr[1]);

        for (String element : arr){
            System.out.println(element);
        }
    }

}
