package com.Ashutosh;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {2,7,8},
                {2,6,8,4,6},
                {2,4,5,7}
        };

        for (int row = 0; row< arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.println(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

}
