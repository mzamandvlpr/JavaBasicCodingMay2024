package javabasiccodingmay24;

public class JavaDataType {
    public  static void main(String[] args)
    {
        /*
          There are two group of Data type. They are
          1. Primitive DataType- byte, short, int, long, float, double, boolean and char
          2. Non Primitive Data Type- String, Arrays and Classes
         */

        int a=10;
        System.out.println(a);

        /*byte data type can store whole number from -128 to 127. This can be used instead of int or other
        integer types to save memory when you are certain that the value will be within -128 and 127
         */

        byte myNumber1=50;
        System.out.println(myNumber1);


        short myNumber2=2000;
        System.out.println(myNumber2);

        long myNumber3=100000000L;
        System.out.println(myNumber3);


        float myNumber4=5.57f;
        System.out.println(myNumber4);
    }
}
