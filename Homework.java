import java.util.*;

public class Homework {
    static double celcius_to_farenheit(double N)
    {   if (N==0)
            return 32.0;
        return ((N * 9 / 5) + 32);
    }
    static void swap_variable(int &a,int &b){
        int temp;
        temp = a;
        a= b;
        b= temp;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        if (N==0)
        
        System.out.println(celcius_to_farenheit(N));
        int a=10 ;
        int b = 20 ;
        swap_variable(b, a);
        System.out.println("a is " +a+"\n"+ "b is " +b);
    }

}
