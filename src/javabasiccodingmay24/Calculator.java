package javabasiccodingmay24;

import java.util.Scanner;

public class Calculator {
    public  static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number");
              double numA=input.nextDouble();
        System.out.println("Enter your number");
        double numB=input.nextDouble();

        double reslult = numA - numB;
        System.out.println(reslult);

    }
}
