import java.util.*;

public class Exercise {
    public static int Average(int a,int b,int c ){
        return (a+b+c)/3;
    }
    public static void Fibonacci(int n){
        int first =0;
        int second = 1;
        while (n!=0){
            int third = first +second;
            System.out.print(" "+ first);
            first = second ;
            second = third;
            n--;
        }
    return;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Average(a,b,c));
        Fibonacci(c);
    }
    
}
