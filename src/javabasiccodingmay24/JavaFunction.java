package javabasiccodingmay24;

public class JavaFunction {

   static void sum()
    {
        int a=5;
        int b=6;
        int result=a+b;
        System.out.println(result);

    }

    static void sub(int a, int b)
    {
        int result=a-b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        sum();
        sub(5,6);
    }

}
