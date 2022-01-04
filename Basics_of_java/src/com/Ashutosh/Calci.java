package com.Ashutosh;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Take input from the user until X or x is pressed;
        int ans= 0;
        while (true){
            //take the operator
            System.out.println("Enter the operation you wanna perform: ");
            char op = in.next().trim().charAt(0);
            //condition to check the operator
            if (op =='+' || op =='-' || op == '*' || op == '/' || op == '%'){
                //input two number
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                // perform the operations accordingly
                if (op =='+'){
                    ans = n1 + n2;

                }
                if (op =='-'){
                    ans = n1 - n2;

                }
                if (op == '*'){
                    ans = n1 * n2;

                }
                if (op == '/'){
                    if (n2!=0){
                        ans = n1/n2;
                    }



                }
                if (op == '%'){
                    ans = n1%n2;

                }
            }else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid operations!!");
            }
            System.out.println(ans);

        }
    }
}
