import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class time {
    public static int addnum(int a,int b){
        return a+b;
    }
    public static void main(String argv[]){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        int b = sc.nextInt();
        System.out.println(b);
        System.out.println(addnum(a,b));
        if (a>b)
        System.out.println("it's accumulator");
        if (b>a)
        System.out.println("it's bitch");
        
        int [] xmas = new int[b];
        for (int i=0;i<b;i++){
            xmas[i] = sc.nextInt();
            System.out.println("yello");
            
        }
        

        // string 
        String name = "tony ";
        String naga = sc.next();
        String naga1 = sc.nextLine();
        System.out.println(name);
        System.err.println(naga);
        // System.out.println(naga1);
        System.out.println(naga.length());
    }

    
}
