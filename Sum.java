import java.util.*;

public class sum {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
// String name = sc.next();
// String name1 = sc.nextLine();
// System.out.println(name);
// System.out.println(name1);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = a+b;
// System.out.println(sum);
// int a = sc.nextInt();
// if (a%2 == 0)
// System.out.println("Even");
// else 
// System.out.println("odd");
// int a = sc.nextInt();
// int b = sc.nextInt();
// if (a>b)
// System.out.println("a");
// else if (b>a)
// System.out.println("b");
// else 
// System.out.println("both"); 

char a = sc.next().charAt(0);
int b = sc.nextInt();
int c = sc.nextInt();
switch (a){
    case '+' :System.out.println( b + c);
    break;
    case '*' :System.out.println( b * c);
    break;
    case '/' :System.out.println( b / c);
    break;
    case '-' :System.out.println( b - c);
    break;
    default : System.out.println("Invalid statement");
}
}
    
}
