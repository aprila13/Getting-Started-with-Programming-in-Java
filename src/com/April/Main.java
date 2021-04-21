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


        //Logical Operators
//        int students = 150;
//        int rooms = 4;
//        int rooms = 0;
////        if(students / rooms > 30) {
////            System.out.println("It's crowded");
////        }
//
//        if(rooms != 0 && students / rooms > 30) {
//            System.out.println("It's crowded");
//        }

        //Switch Statements - Test a single value against multiple conditions
        //Java Switch statements only allow byte, short, int, long, char (primitives)


        //==========LOOPING AND ARRAYS==========
        //While Loop - Condition checked at start of the loop -- if condition is false when starting, body isn't run
        //while (condition) {body; iterator}

        //Calculating the factorial of 4
//        int someValue = 4;
//        int factorial = 1;
//
//        while (someValue > 1) {
//            factorial *= someValue;
//            someValue--;
//        }
//        System.out.println(factorial);

        //Do-While Loop - Condition is checked at end of the loop -- Always runs at least once
        //do {body} while (condition)

//        int iVal = 5;
//        do {
//            System.out.print(iVal);
//            System.out.print(" * 2 = ");
//            iVal *= 2;
//            System.out.print(iVal);
//        } while (iVal < 25);

        //For Loop - Condition checked at the start of the loop
        //for (initialize; condition; iterator) {body}
//        for (int i = 1; i < 100; i *= 2){
//            System.out.println(i);
//        }

        //Arrays - ordered collection of elements
//        float[] theVals = new float[3]; //DataType[] variableName = new DataType[numOfElements];
//        //float[] theVals = {10.0f, 20.0f, 15.0f}; -same as above
//        theVals[0] = 10.0f;
//        theVals[1] = 20.0f;
//        theVals[2] = 15.0f;
//
//        float sum = 0.0f;
//        for (int index = 0; index < theVals.length; index++){
//            sum += theVals[index];
//            System.out.println(sum);
//        }

        //ForEach Loop - runs a statement once for each element
//        for (DataType loopVariable : Array) {body}

        float[] theVals = {10.0f, 20.0f, 15.0f}; // -same as above
        float sum = 0.0f;
        for (float currentVal : theVals) {
            sum += currentVal;
            System.out.println(sum);
        }
    }
}

//Package names are for organization.
//naming convention is reverse domain notation
