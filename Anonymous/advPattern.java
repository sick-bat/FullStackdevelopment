import java.util.*;

public class advPattern {
    public static void main(String [] argv){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(~5);
        
        for (int i=0;i<n;i++){
            for (int j=0;j<2*n;j++){
                if (j<i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        // System.out.println("Namaskar Duniya "+n);
    
    
    
    
    
    
    }
    
}
