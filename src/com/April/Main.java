package com.April;

public class Main {

    //the main method is the entry point for the application
    public static void main(String[] args) {

        System.out.println("First line from app");
        System.out.println("Second line from app");
        System.out.println("Third line from app");

        //Variables
//        int sum = 34;
//        System.out.println(sum);
//
//        int nextSum = sum + 1;
//        System.out.println(nextSum);
//
//        nextSum = 46; //Reassigning value
//        System.out.println(nextSum);
//
//        final int maxStudents = 25; //final modifier - cannot be reassigned
//        System.out.println(maxStudents);

        //Primitive Data Types - are built into Java + the foundation of all other types
        //Primitive types are stored by value
        //Integer - byte, short, long (L), int
        // Float - float (f), double (d)
        // Character - char
        // Boolean


        //Float vs. Int - int cannot work with fractions so even when the answer should be a fraction, an integer with be returned instead
//        float numOne = 13.0f;
//        float numTwo = 5.0f;
//        System.out.println(numOne / numTwo); //2.6

//        int numOne = 13;
//        int numTwo = 5;
//        System.out.println(numOne / numTwo); //2

        //Prefix Operator
//        int someVal = 5;
//        System.out.println(++someVal); //6
//        System.out.println(someVal); //6 - The increment has already taken placed and changed the variable

        //Postfix Operator
//        int someOtherInt = 5;
//        System.out.println(someOtherInt++); //5, increment happens but isn't shown here
//        System.out.println(someOtherInt); //6

        //Compound Assignment Operators
        int myVal = 50;
        myVal -= 5;
        System.out.println(myVal);
    }
}

//Package names are for organization.
//naming convention is reverse domain notation
