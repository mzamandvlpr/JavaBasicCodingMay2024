package javabasiccodingmay24;

public class JavaStringReverse {
    public  static void main(String[] args)
    {
        int i=556;
        while(i>0)
        {
            int j=i%10;
            System.out.println(j + "");
            i=i/10;
        }
    }
}
