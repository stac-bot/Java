package com.Ashutosh;

public class Scoping {
    public static void main(String[] args){
        int a =10;
        int b =20;
        String name = "Kunal";
        {
            a = 99;//cannot reinitialised in same funtion again
            System.out.println(a);
            name = "ashu";
            System.out.println(name);
            //reassign the ref variable

        }


            //System.out.println(a);
            int c = 900;
            System.out.println(a);
            System.out.println(name);
            //scoping in the loops
            for (int i = 0; i < 4; i++) {
                int num = 90;
                a = 1000 + i;
                System.out.println(a);
            }
            System.out.println();
        }
        static void random(int marks){
            int num = 67;
            System.out.println(num);
            System.out.println(marks);
        }

    }


