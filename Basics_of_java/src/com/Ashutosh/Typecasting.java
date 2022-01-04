package com.Ashutosh;

public class Typecasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////        float x = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num +" "+ x);

        // type casting
        //from float to int
//        int num = (int)(436.6756);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 258; // does the autmatic x%256 which is byte conversion
//        byte b = (byte)(a);
//        System.out.println(b);
//
//        byte a = 43;
//        byte b = 35;
//        byte c = 100;
//        int d = a * b / c; // notice teh int data type provided which does the automatic conversion
//
//        System.out.println(d);

        // the operation below cannot be performed because we are assigning
        //an int data type to the byte data type which is against the (256) protocol(-,__,-)
//        byte b = 50;
//        b = b + 2;

        // char to int
//        int number = 'A';
//        System.out.println(number);// will output 65 which is an ascii value for the 'A'

           //java follows unicode principles
        // checkout
//        System.out.println("\n" +
//                "नमस्ते");
//        System.out.println("hello in japanese  " + "こんにちは");

//        System.out.println(3 * 3546.45464756f);

        // all in one typecasting let' do it
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 564;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)* (i/c) - (d-s);
        System.out.println((f*b)+ " "+ (i/c)+ " "+ (d-s));
        System.out.println(result);


    }
}
