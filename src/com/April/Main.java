package com.April;

public class Main {

    //the main method is the entry point for the application. You can call other methods from here
    public static void main(String[] args) {

//        System.out.println("First line from app");
//        System.out.println("Second line from app");
//        System.out.println("Third line from app");

        //==========Variables, Data Types and Math Operators==========
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
//        int myVal = 50;
//        myVal -= 5;
//        System.out.println(myVal);

        //Operator Precedence (highest to lowest precedence)
        //1. Postfix  X++ X--
        //2. Prefix ++X --X
        //3. Multiplicative  * / %
        //4. Additive  + -
        // Operators of equal precedence are evaluated left to right
        // Precedence can be overriden with parenthesis
        // Nested parenthesis evaluated from inside out

//        int valA = 21;
//        int valB = 6;
//        int valC = 3;
//
//        int result1 = valA - valB / valC; //19, Division then subtraction
//        int result2 = (valA - valB) / valC; //5, Parenthesis then division
//        System.out.println(result1);
//        System.out.println(result2);

        //Type Conversion
        //Implicit Conversion - Conversion automatically done by the compiler
        //Implicit conversion can be done with widening conversion, from small to bigger
//        int intValueOne = 50;
//        long longValueOne = intValueOne; //Implicit Conversion
//        System.out.println(longValueOne);
//
//        //Explicit Conversion - Conversion done with a cast operator
//        //Explicit Conversions can do widening and narrowing
//        long longValueTwo = 50;
//        int intValueTwo = (int) longValueTwo; //(int) is a cast operator
//        System.out.println(intValueTwo);


        //==========Conditional Logic and Block Statements==========
        //Relational Operators -- == Equal to, != Not Equal to

        //Conditional Assignment
        //result = condition ? true value : false value;

//        int val1 = 7;
//        int val2 = 5;
//        int maxVal = val1 > val2 ? val1 : val2;
//        System.out.println(maxVal);

        //Chaining if-else
//        int value1 = 40;
//        int value2 = 10;
//
//        if(value1 > value2) {
//            System.out.println("value 1 is bigger");
//        } else if (value1 < value2) {
//            System.out.println("value 2 is bigger");
//        } else {
//            System.out.println("value 1 and value 2 are equal");
//        }

    }
}

//Package names are for organization.
//naming convention is reverse domain notation
