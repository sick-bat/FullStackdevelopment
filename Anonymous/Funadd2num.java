import java.util.*;
public class Funadd2num {
    public static int addnum(int a,int b){
        return (a+b);
    }
    public static int Fact(int n){
        int fact = 1;
        while (n>0){
            fact = fact *n;
            n--;

        }
        return fact;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of two numbers " +addnum(a,b));
        System.out.println();
        System.out.println("Factorial of " +a+ " is " + Fact(a));
    }
    
}
