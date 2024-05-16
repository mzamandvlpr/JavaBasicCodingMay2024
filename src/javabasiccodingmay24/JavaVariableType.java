package javabasiccodingmay24;

import com.sun.jdi.InconsistentDebugInfoException;

public class JavaVariableType {
    public static void main(String[] args) {
            /*
               Variables are container.It can store date.
               In Java there are different type of variables. They are
               int, float, char, boolean, string
               int- integers stores whole numbers
               float- float stores floating number with decimal such as 10.99 or -10.99
               char- Stores single character, such 'a' or 'B' Char values are surrounded by single quotes
               boolean -stores values with two states; true or false
               String- stores text. string values are surrounded by double quotes.

             */

        int myNumber = 8;
        float myFloatNumber=6.88f;
        char myCharacter ='a';
        boolean myValue= true;

        String myStringValue="My String Value";
        System.out.println(myNumber);
        System.out.println(myFloatNumber);
        System.out.println(myCharacter);
        System.out.println(myValue);
        System.out.println(myStringValue);
    }
}

