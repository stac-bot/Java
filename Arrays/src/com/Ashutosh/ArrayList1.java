package com.Ashutosh;


import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        for(int i = 0; i<=3; i++){
            list.add(in.nextInt());
        }

        //get the item at any index
        for (int i = 0; i<=3; i++){
            System.out.println(list.get(i));
        }
        //replce the index values
        for (int i = 0; i <=3; i++){
            System.out.println(list.add(i));

        }




    }
}
