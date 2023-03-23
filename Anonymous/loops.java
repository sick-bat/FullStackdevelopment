import java.util.*;

public class loops {
    public static void main(String[] args){
        for (int i=0;i<5;i++)
        System.out.println("Hello");
        int j= 10;
        while (j>0){
            System.out.println(j);
            j--;

        }
        do{
            System.out.println(j);
            j++;
        }while (j<11);
        //homework
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=10;i++)
        System.out.println(n*i);
    }
    
}
