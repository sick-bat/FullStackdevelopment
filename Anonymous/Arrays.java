import java.util.*;
public class Arrays {
    public static void main(String [] argv){
        int [] number =  new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<number.length;i++){
            int a = sc.nextInt();
            number[i] = a;
        }
        for (int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
    
}
